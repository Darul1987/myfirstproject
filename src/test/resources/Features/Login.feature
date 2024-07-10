Feature: verify the omr login module

  Scenario Outline: verify omr login with valid data
    Given user is the omr page
    When user enter the "<userName>" and "<password>"
    When user click the login button
    Then user should verify after login sucess msg

    Examples: 
      | userName        | password   |
      | Darul87@gmail.com | Darul@1987 |
