$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "user login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user login with valid data.",
  "description": "",
  "id": "user-login;user-login-with-valid-data.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "MerkConnect application should be launched for \"I am a Health Care Professional\".",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to login page.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter login username \"afagava\" and password \"Demo@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify if user \"afagava\" is logged in successfully.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "I am a Health Care Professional",
      "offset": 48
    }
  ],
  "location": "LauchingPageSteps.merckLaunch(String)"
});
formatter.result({
  "duration": 53123329913,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.navigateToLogin()"
});
formatter.result({
  "duration": 9255138840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "afagava",
      "offset": 22
    },
    {
      "val": "Demo@123",
      "offset": 45
    }
  ],
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "duration": 4189754349,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "afagava",
      "offset": 16
    }
  ],
  "location": "HomeSteps.verifyLogin(String)"
});
formatter.result({
  "duration": 5345572766,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //span[text()\u003d\u0027User Name: \u0027]/..\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027SAM-PC\u0027, ip: \u0027192.168.31.141\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_172\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 59.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:headless: false, moz:processID: 9432, moz:profile: C:\\Users\\SAM\\AppData\\Local\\..., moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: XP, platformName: XP, platformVersion: 6.1, rotatable: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}\nSession ID: 1635f269-fdb1-4b98-9af5-dc593650a082\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027User Name: \u0027]/..}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getText(Unknown Source)\r\n\tat com.merkconnectUIautomation.pom.Home.verifyLogin(Home.java:45)\r\n\tat merkconnectUIautomation.steps.HomeSteps.verifyLogin(HomeSteps.java:26)\r\n\tat ✽.Then Verify if user \"afagava\" is logged in successfully.(login.feature:8)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "userlogin with multiple login credentials",
  "description": "",
  "id": "user-login;userlogin-with-multiple-login-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "MerkConnect application should be launched.",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Navigate to login page.",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter login username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify if user should not login.",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "user-login;userlogin-with-multiple-login-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "user-login;userlogin-with-multiple-login-credentials;;1"
    },
    {
      "cells": [
        "afagava",
        "Demo@123"
      ],
      "line": 19,
      "id": "user-login;userlogin-with-multiple-login-credentials;;2"
    },
    {
      "cells": [
        "sumit",
        "pas123"
      ],
      "line": 20,
      "id": "user-login;userlogin-with-multiple-login-credentials;;3"
    },
    {
      "cells": [
        "sumit",
        "pas1234"
      ],
      "line": 21,
      "id": "user-login;userlogin-with-multiple-login-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "userlogin with multiple login credentials",
  "description": "",
  "id": "user-login;userlogin-with-multiple-login-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "MerkConnect application should be launched.",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Navigate to login page.",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter login username \"afagava\" and password \"Demo@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify if user should not login.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "HomeSteps.navigateToLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "afagava",
      "offset": 22
    },
    {
      "val": "Demo@123",
      "offset": 45
    }
  ],
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "userlogin with multiple login credentials",
  "description": "",
  "id": "user-login;userlogin-with-multiple-login-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "MerkConnect application should be launched.",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Navigate to login page.",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter login username \"sumit\" and password \"pas123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify if user should not login.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "HomeSteps.navigateToLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sumit",
      "offset": 22
    },
    {
      "val": "pas123",
      "offset": 43
    }
  ],
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "userlogin with multiple login credentials",
  "description": "",
  "id": "user-login;userlogin-with-multiple-login-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "MerkConnect application should be launched.",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Navigate to login page.",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter login username \"sumit\" and password \"pas1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify if user should not login.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "HomeSteps.navigateToLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sumit",
      "offset": 22
    },
    {
      "val": "pas1234",
      "offset": 43
    }
  ],
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});