$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TC1_AdactinHotel_Login.feature");
formatter.feature({
  "name": "Verify Adactin Hotel Login Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Verify Login Page With Valid Credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password and click on login button",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "mani@gmail.com",
        "mani@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password_and_click_on_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login success message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_verify_login_success_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: verify\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.stepdefinition.LoginSteps.user_verify_login_success_message(LoginSteps.java:37)\r\n\tat ✽.User verify login success message(file:src/test/resources/Features/TC1_AdactinHotel_Login.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login Page With Invalid Credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Reg"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password and click on login button",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "bala@gmail.com",
        "bala@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password_and_click_on_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify login success message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_verify_login_success_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: verify\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.stepdefinition.LoginSteps.user_verify_login_success_message(LoginSteps.java:37)\r\n\tat ✽.User verify login success message(file:src/test/resources/Features/TC1_AdactinHotel_Login.feature:18)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/TC2_AdactinHotel_SearchHotel.feature");
formatter.feature({
  "name": "Verify Adactin Hotel Search Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate Search Hotel with valid information",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is on adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and click on login button",
  "keyword": "When "
});
formatter.step({
  "name": "User select \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnumberOfRooms\u003e\",\"\u003cadultsPerRoom\u003e\" and \"\u003cchildrenPerRoom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click on search Button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotel",
        "roomType",
        "numberOfRooms",
        "adultsPerRoom",
        "childrenPerRoom"
      ]
    },
    {
      "cells": [
        "nitish123",
        "O55U1Z",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "2 - Two",
        "2 - Two"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Search Hotel with valid information",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"nitish123\" and \"O55U1Z\" and click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_and_and_click_on_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select \"Sydney\",\"Hotel Creek\",\"Standard\",\"2 - Two\",\"2 - Two\" and \"2 - Two\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelSteps.user_select_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on search Button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelSteps.user_click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});