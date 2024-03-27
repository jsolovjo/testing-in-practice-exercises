package com.issue.tracking.system;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import org.openqa.selenium.chrome.ChromeOptions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.google.common.collect.ImmutableMap;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EshopTest {
    private static final SelenideElement loginBtn = $(byId("login-button"));

    @BeforeAll
    static void webDriverSetup() {
        // if Chrome browser is used, force not to check for a weak password by disabling password manager
        if (Configuration.browser.equals("chrome")) {
            final ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", ImmutableMap.of("credentials_enable_service", false, "profile.password_manager_enabled", false));
            Configuration.browserCapabilities = options;
        }
    }

    @Test
    @Order(1)
    public void openEshop() {
        open("https://www.saucedemo.com/");
        $(byId("user-name")).setValue("problem_user");
        $(byId("password")).setValue("secret_sauce");
        loginBtn.shouldBe(visible).click();
        $(byText("Products")).shouldBe(visible);
    }

    @Test
    @Order(2)
    public void checkProductNames() {
        $$(byClassName("inventory_item_name"))
                .shouldHave(texts("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"));
    }

    @Test
    @Order(3)
    public void addToCartBackpack() {
        $(byId("add-to-cart-sauce-labs-backpack")).shouldBe(visible).click();
        $(byId("remove-sauce-labs-backpack")).should(exist);
    }

    @Test
    @Order(4)
    public void removeFromCartBackpack() {
        $(byId("remove-sauce-labs-backpack")).shouldBe(visible).click();
        $(byId("add-to-cart-sauce-labs-backpack")).should(exist);
    }

    @Test
    @Order(5)
    public void checkOut() {
        $(byId("shopping_cart_container")).shouldBe(visible).click();
        $(byId("checkout")).shouldBe(visible).click();
        $(byId("first-name")).shouldBe(visible).setValue("TestName");
        $(byId("last-name")).shouldBe(visible).setValue("TestLastName");
        $(byId("postal-code")).shouldBe(visible).setValue("12345");
        $(byId("continue")).shouldBe(visible).click();
        $(byClassName("title")).shouldHave(text("Checkout: Overview"));
    }
}
