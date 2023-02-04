$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/lofin2.feature");
formatter.feature({
  "name": "facebook login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login to valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open the prowser and go to url",
  "keyword": "Given "
});
formatter.match({
  "location": "testt.userOpenTheProwserAndGoToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username",
  "keyword": "When "
});
formatter.match({
  "location": "testt.userEnterTheUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password",
  "keyword": "Then "
});
formatter.match({
  "location": "testt.userEnterThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cuser click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "testt.cuserClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close is browserrssd",
  "keyword": "Then "
});
formatter.match({
  "location": "testt.userCloseIsBrowserrssd()"
});
formatter.result({
  "status": "passed"
});
});