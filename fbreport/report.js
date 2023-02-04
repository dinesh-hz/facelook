$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/feature_files/createnewaccount.feature");
formatter.feature({
  "name": "it is check the creatnew account fp webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check the craet new account page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user lanuch the browser with url login page",
  "keyword": "Given "
});
formatter.match({
  "location": "singup_page.userLanuchTheBrowserWithUrlLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the  createnewaccount button",
  "keyword": "Then "
});
formatter.match({
  "location": "singup_page.userClickTheCreatenewaccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user full the firstname  and lastename",
  "keyword": "Then "
});
formatter.match({
  "location": "singup_page.userFullTheFirstnameAndLastename()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the phonenumber or emailid",
  "keyword": "When "
});
formatter.match({
  "location": "singup_page.userEnterThePhonenumberOrEmailid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then user enter the password",
  "keyword": "When "
});
formatter.match({
  "location": "singup_page.thenUserEnterThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user full the data of brith of brith",
  "keyword": "Then "
});
formatter.match({
  "location": "singup_page.userFullTheDataOfBrithOfBrith()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the Gender",
  "keyword": "And "
});
formatter.match({
  "location": "singup_page.userSelectTheGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the sign up button",
  "keyword": "Then "
});
formatter.match({
  "location": "singup_page.userClickTheSignUpButton()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("./src/test/resources/feature_files/lofin2.feature");
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
  "location": "Logins.userOpenTheProwserAndGoToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username",
  "keyword": "When "
});
formatter.match({
  "location": "Logins.userEnterTheUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password",
  "keyword": "Then "
});
formatter.match({
  "location": "Logins.userEnterThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cuser click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Logins.cuserClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close is browserrssd",
  "keyword": "Then "
});
formatter.match({
  "location": "Logins.userCloseIsBrowserrssd()"
});
formatter.result({
  "status": "passed"
});
});