$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jit majumdar/Desktop/WebD/Work2/FreeCrmBDDFramework/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the page is cogmento CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user will move to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.login_page()"
});
formatter.result({
  "duration": 34282480210,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_cogmento_CRM()"
});
formatter.result({
  "duration": 63314600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3394408683,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 187241406,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_will_move_to_home_page()"
});
formatter.result({
  "duration": 9122448,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Create Contact test",
  "description": "",
  "id": "free-crm-login-feature;create-contact-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is in contact page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on new button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user fills the contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on save button",
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
});