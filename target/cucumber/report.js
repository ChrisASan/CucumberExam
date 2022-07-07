$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/TestQ1AndQ2.feature");
formatter.feature({
  "line": 2,
  "name": "TODO List Functionality validation",
  "description": "",
  "id": "todo-list-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario3"
    }
  ]
});
formatter.before({
  "duration": 2370888600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1 User should be able to change background to Sky Blue",
  "description": "",
  "id": "todo-list-functionality-validation;1-user-should-be-able-to-change-background-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the skyblue button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to skyblue",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoStepDefinition.button_exists()"
});
formatter.result({
  "duration": 143525400,
  "status": "passed"
});
formatter.match({
  "location": "TodoStepDefinition.i_click_on_the_skyblue_button()"
});
formatter.result({
  "duration": 54279900,
  "status": "passed"
});
formatter.match({
  "location": "TodoStepDefinition.the_background_color_will_change_to_skyblue()"
});
formatter.result({
  "duration": 77292200,
  "status": "passed"
});
formatter.after({
  "duration": 635794900,
  "status": "passed"
});
formatter.before({
  "duration": 1498383100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "2 User should be able to change background to Sky Blue",
  "description": "",
  "id": "todo-list-functionality-validation;2-user-should-be-able-to-change-background-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set skywhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on the skywhite button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to skywhite",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoStepDefinition.set_skywhite_button_exists()"
});
formatter.result({
  "duration": 96284600,
  "status": "passed"
});
formatter.match({
  "location": "TodoStepDefinition.i_click_on_the_skywhite_button()"
});
formatter.result({
  "duration": 38444300,
  "status": "passed"
});
formatter.match({
  "location": "TodoStepDefinition.the_background_color_will_change_to_skywhite()"
});
formatter.result({
  "duration": 65591800,
  "status": "passed"
});
formatter.after({
  "duration": 639567400,
  "status": "passed"
});
});