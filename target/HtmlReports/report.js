$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/taxdooApp.feature");
formatter.feature({
  "name": "TaxDoo web application booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects Average Revenue\u003crevenue\u003e per Month",
  "keyword": "When "
});
formatter.step({
  "name": "User selects Package",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Next button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "revenue"
      ]
    },
    {
      "cells": [
        "1000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.TaxdooSteps.verifyLanding()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Average Revenue1000 per Month",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.TaxdooSteps.userSelectsAverageRevernuePerMonth(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Package",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.TaxdooSteps.userSelectsPackage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Next button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.TaxdooSteps.userClicksNextButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cspan class\u003d\"notranslate\"\u003e...\u003c/span\u003e is not clickable at point (937, 10). Other element would receive the click: \u003cdiv class\u003d\"_navigation__wrapper_dp5tc_9\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d108.0.5359.125)\nBuild info: version: \u00274.0.0-alpha-5\u0027, revision: \u0027b3a0d621cc\u0027\nSystem info: host: \u0027SHIVANI-PC\u0027, ip: \u0027192.168.1.15\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\Shivani\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58196}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f209a2cfa72b4688bd74c14867b6457c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:316)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat pages.landingPageTaxdoo.userClicksNextButton(landingPageTaxdoo.java:52)\r\n\tat stepDefinition.TaxdooSteps.userClicksNextButton(TaxdooSteps.java:47)\r\n\tat ✽.User clicks Next button(file:///D:/prachi/workspace/Eclipse/taxdoo/src/test/resources/Features/taxdooApp.feature:6)\r\n",
  "status": "failed"
});
});