$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PlanIT_Verifying_Cart.feature");
formatter.feature({
  "line": 3,
  "name": "Plan IT application scenarios",
  "description": "As an end user I want open the planIT Application and validate the contact and shop pages",
  "id": "plan-it-application-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@P12324"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Action 2 - check the shops page and Items added to cart",
  "description": "",
  "id": "plan-it-application-scenarios;action-2---check-the-shops-page-and-items-added-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Creation of users",
  "description": "",
  "id": "plan-it-application-scenarios;creation-of-users",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to \"shops\" page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on buy button \u003cnumber of times\u003e on \u003citem\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on the cart menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the items selected are displayed in the cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "plan-it-application-scenarios;creation-of-users;",
  "rows": [
    {
      "cells": [
        "number of times",
        "item"
      ],
      "line": 14,
      "id": "plan-it-application-scenarios;creation-of-users;;1"
    },
    {
      "cells": [
        "2",
        "\"Funny Cow\""
      ],
      "line": 15,
      "id": "plan-it-application-scenarios;creation-of-users;;2"
    },
    {
      "cells": [
        "1",
        "\"Fluffy Bunny\""
      ],
      "line": 16,
      "id": "plan-it-application-scenarios;creation-of-users;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Creation of users",
  "description": "",
  "id": "plan-it-application-scenarios;creation-of-users;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@P12324"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to \"shops\" page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on buy button 2 on \"Funny Cow\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on the cart menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the items selected are displayed in the cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Creation of users",
  "description": "",
  "id": "plan-it-application-scenarios;creation-of-users;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@P12324"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to \"shops\" page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on buy button 1 on \"Fluffy Bunny\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on the cart menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the items selected are displayed in the cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("PlanItContactPageScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Plan IT application scenarios",
  "description": "As an end user I want open the planIT Application and validate the contact and shop pages",
  "id": "plan-it-application-scenarios",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"contact\" page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Action 1 - check For errors",
  "description": "",
  "id": "plan-it-application-scenarios;action-1---check-for-errors",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@P12321"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "validate the errors",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "populate Mandatory fields",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "resolve the errors",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"contact\" page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "Action 2 - Successful Submission",
  "description": "",
  "id": "plan-it-application-scenarios;action-2---successful-submission",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@P12322"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Fill up all the mandatory fields with the correct details",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Submit the details",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "a valid message successful submission message is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"contact\" page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Action 2 - check the mandatory fields with invalid data",
  "description": "",
  "id": "plan-it-application-scenarios;action-2---check-the-mandatory-fields-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@P12323"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "fill up the contacts page with invalid data",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "error messages should be seen",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});