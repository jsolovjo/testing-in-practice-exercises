# Issue Tracking System
## Tasks Overview
- Get familiar with the application
- Run the automated tests
- Identify failing tests
- Investigate the issues
- Report your findings in the Issue Tracking System

## Instructions
- Get familiar with the Sauce Eshop Demo Application - https://www.saucedemo.com/
  - username: `problem_user`
  - password: `secret_sauce`
- Run the tests from the `issue-tracking-system` module
  ```console
  mvn clean install -Dtest=EshopTest
  ```
    - As extra parameters for the command you can set:
      - browser, e.g. `-Dselenide.browser=chrome`
      - browser size, e.g. `-Dselenide.browserSize=1940x1040`
      - timeout in ms (waiting time for assertions), e.g. `-Dselenide.timeout=5000`
- Identify the failing tests by looking at the console output
- Check the code of the failing tests
- Reproduce the failures manually by accessing the web application
- Create an issue report for each failure separately and include the following information:
  - Title
  - Type of the issue
  - Priority
  - Description
  - Application component/s (e.g. list of products, basket, checkout, etc.)
  - Environment
  - Risks
