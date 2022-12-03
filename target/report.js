$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@unit"
    }
  ]
});
formatter.scenario({
  "name": "To valid the login by passing data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@unit"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the application \u0027",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookCode.to_launch_the_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the data to the email box",
  "rows": [
    {
      "cells": [
        "emailone",
        "selnium"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "java"
      ]
    },
    {
      "cells": [
        "emailThree",
        "maven"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookCode.to_pass_the_data_to_the_email_box(DataTable)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Chech the message expected:\u003c[F]acebook\u003e but was:\u003c[f]acebook\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.stepdefinition.FacebookCode.to_pass_the_data_to_the_email_box(FacebookCode.java:43)\r\n\tat ✽.To pass the data to the email box(src/test/resources/Facebook.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the data to the Password box",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "java",
        "maven"
      ]
    },
    {
      "cells": [
        "hhaga",
        "yrab"
      ]
    },
    {
      "cells": [
        "gfbss",
        "dgdbn"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookCode.to_pass_the_data_to_the_Password_box(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login Btn",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookCode.to_click_the_login_Btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/GAmazon.feature");
formatter.feature({
  "name": "To validate the login btn in amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "To validate the btn by passing data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonCode.to_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the sign in btn",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonCode.to_click_the_sign_in_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the mobile num",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonCode.to_pass_the_mobile_num()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonCode.to_click_the_continue_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonCode.to_pass_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Signin btn",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonCode.click_the_Signin_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});