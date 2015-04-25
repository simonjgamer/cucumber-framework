$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewUserWorkFlow.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user\nI want to register in the net-a-porter website\nSo that I can shop in the website",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 3134736336,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign up a new user",
  "description": "",
  "id": ";sign-up-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "she chooses to sign up",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "she provides the first name as Testfirstname",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "she provides the second name as Testsecondname",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "she provides the email",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "she provides the password as 123456",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "she provides the confirm passowrd again as 123456",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "she signs-up",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "she should be logged in to the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingSteps.setup()"
});
formatter.result({
  "duration": 11184082113,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 7079168638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testfirstname",
      "offset": 31
    }
  ],
  "location": "SignUpPageSteps.she_provides_the_first_name_as(String)"
});
formatter.result({
  "duration": 160147421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testsecondname",
      "offset": 32
    }
  ],
  "location": "SignUpPageSteps.she_provides_the_second_name_as(String)"
});
formatter.result({
  "duration": 162659344,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.she_provides_the_email_as()"
});
formatter.result({
  "duration": 158434294,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 29
    }
  ],
  "location": "SignUpPageSteps.she_provides_the_password_as(String)"
});
formatter.result({
  "duration": 141757241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 43
    }
  ],
  "location": "SignUpPageSteps.she_provides_the_confirm_password_again_as(String)"
});
formatter.result({
  "duration": 128352498,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.she_signs_up()"
});
formatter.result({
  "duration": 3063699833,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.she_should_be_logged_in_to_the_website()"
});
formatter.result({
  "duration": 399699003,
  "status": "passed"
});
formatter.after({
  "duration": 204883459,
  "status": "passed"
});
});