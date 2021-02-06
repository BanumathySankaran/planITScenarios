$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PlanItContactPageScenarios.feature");
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
formatter.match({
  "location": "PlanIT_HomePageVerification.i_am_on_Home_Page()"
});
formatter.result({
  "duration": 6869783700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contact",
      "offset": 15
    }
  ],
  "location": "PlanIT_HomePageVerification.i_navigate_to_respective_page(String)"
});
formatter.result({
  "duration": 228557300,
  "status": "passed"
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
formatter.match({
  "location": "PlanITScenarios.click_on_submit_button()"
});
formatter.result({
  "duration": 245563400,
  "status": "passed"
});
formatter.match({
  "location": "PlanITScenarios.validate_the_errors()"
});
formatter.result({
  "duration": 193046700,
  "status": "passed"
});
formatter.match({
  "location": "PlanITScenarios.populate_Mandatory_fields()"
});
formatter.result({
  "duration": 110451600,
  "status": "passed"
});
formatter.match({
  "location": "PlanITScenarios.resolve_the_errors()"
});
formatter.result({
  "duration": 12766662800,
  "status": "passed"
});
});