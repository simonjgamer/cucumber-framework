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
  "duration": 3317444852,
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
  "name": "she provides the email as validemail@yopmail.com",
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
  "duration": 11070484242,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 4409159734,
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
  "duration": 137982408,
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
  "duration": 147122887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validemail@yopmail.com",
      "offset": 26
    }
  ],
  "location": "SignUpPageSteps.she_provides_the_email_as(String)"
});
formatter.result({
  "duration": 190653756,
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
  "duration": 144054121,
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
  "duration": 146848563,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.she_signs_up()"
});
formatter.result({
  "duration": 1653998702,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.she_should_be_logged_in_to_the_website()"
});
formatter.result({
  "duration": 5199993263,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"acc_dd_click_area\"}\nCommand duration or timeout: 5.19 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Simons-MacBook-Pro.local\u0027, ip: \u0027192.168.0.7\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d37.0.2, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f36a39f3-3928-7b42-b5ff-6b0a887063d7\n*** Element info: {Using\u003dclass name, value\u003dacc_dd_click_area}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:433)\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:387)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat pages.HomePage.isSignOutLinkDisplayed(HomePage.java:17)\n\tat steps.HomePageSteps.she_should_be_logged_in_to_the_website(HomePageSteps.java:14)\n\tat ✽.Then she should be logged in to the website(NewUserWorkFlow.feature:16)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"class name\",\"selector\":\"acc_dd_click_area\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Simons-MacBook-Pro.local\u0027, ip: \u0027192.168.0.7\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/sn/l4y0dg7d62sdxpg6b1qddyk00000gn/T/anonymous4064678660003512522webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///var/folders/sn/l4y0dg7d62sdxpg6b1qddyk00000gn/T/anonymous4064678660003512522webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:603)\n",
  "status": "failed"
});
formatter.after({
  "duration": 172130897,
  "status": "passed"
});
});