# Test Cases and Matrices
## Tasks
### Instructions
- Read the [Customer Requirements](requirements.md)
- Create test cases (at least 4 cases) in the same file to cover specified business requirements
- Create 2 test matrices in the same file:
  - for smoke testing to cover minimally needed combinations to have valuable outputs
  - for full testing to cover all possible combinations to fulfill the customer's requirements

### Online mini-games
You can improve your practical test design knowledge based on the missing test cases using the following web based exercises - [link](https://test-design.org/practical-exercises/)

There are a few online mini-games about testing and creating test cases

After that if you wish you can come back to the Test Case and Matrices task and improve your test cases

### Example of the test case
| Test Case ID | Test Cae Description                   | Test Steps                                                  | Test Data                              | Expected Results                          | Actual Results | Pass/Fail |
|--------------|----------------------------------------|-------------------------------------------------------------|----------------------------------------|-------------------------------------------|----------------|:----------|
| TU01         | Check Customer Login with valid Data   | 1. Enter UserID<br/> 2. Enter Password<br/> 3. Click Submit | Userid = guru99<br/> Password = pass99 | User should Login into an application     | As Expected    | Pass      |
| TU02         | Check Customer Login with invalid Data | 1. Enter UserID<br/> 2. Enter Password<br/> 3. Click Submit | Userid = guru99<br/> Password = gass99 | User should not Login into an application | As Expected    | Pass      |
Inspired by [source](https://www.guru99.com/test-case.html)

### Example of the test matrix
| OS / jdk        | jdk8 |  jdk11  |  openjdk8  |  openjdk11  |
|:----------------|:----:|:-------:|:----------:|:-----------:|
| RHEL8           |  X   |         |     X      |      X      |
| Windows 11      |  X   |         |            |             |
| macOS Catalina  |      |    X    |     X      |             |
