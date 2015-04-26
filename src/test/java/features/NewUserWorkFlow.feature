Feature:
  As a user
  I want to register in the net-a-porter website
  So that I can shop in the website

  @register
  Scenario: Sign up a new user
    Given the user is on landing page
    When she chooses to sign up
    And she provides the first name as Testfirstname
    And she provides the second name as Testsecondname
    And she provides the email
    And she provides the password as 123456
    And she provides the confirm password again as 123456
    And she signs-up
    Then she should be logged in to the website

  @signin
  Scenario: Sign in with registered user
      Given the user is on landing page
      When she chooses to sign in
      And she provides the email id as validemail03@yopmail.com
      And she provides the password in signin page as 123456
      And she signs-in
      Then she should be logged in to the website
