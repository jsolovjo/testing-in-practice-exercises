# Issue Tracking System
## Tasks
- Identify failing tests
- Investigate what causes the failures
- Report your findings in the Issue Tracking System

## Instructions
- To run the tests execute the following command from the `issue-tracking-system` submodule:
```
mvn clean install -Dtest=EshopTest
```
- As extra parameters for the command you can set:
  - browser, e.g. `-Dselenide.browser=chrome`
  - browser size, e.g. `-Dselenide.browserSize=1940x1040`
  - timeout in ms (waiting time for assertions), e.g. `-Dselenide.timeout=5000`
- The running app for manual investigation can be found at the https://www.saucedemo.com/
  - username: `problem_user`
  - password: `secret_sauce`
- Issue report has to contain at least:
  - Title
  - Type of the issue
  - Priority
  - Description
  - Component/s
    - list of products
    - basket
    - checkout
    - etc.
  - Environment
  - Risks
