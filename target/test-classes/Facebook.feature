
@unit
Feature: To validate the login functionality


@Smoke
  Scenario: To valid the login by passing data
   
    When To launch the url of the application '
    And To pass the data to the email box
      | emailone   | selnium |
      | emailtwo   | java    |
      | emailThree | maven   |
    And To pass the data to the Password box
      | email | password |
      | java  | maven   |
      | hhaga | yrab    |
      | gfbss | dgdbn   |
    And To click the login Btn

   
