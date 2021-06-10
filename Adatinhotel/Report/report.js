$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature_files/ Adatin.feature");
formatter.feature({
  "name": "to Verify the Adatin hotel pages",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Verify the login pages",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in login page validating url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.user_is_in_login_page_validating_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checking logo,banner,app image",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.user_checking_logo_banner_app_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entering username \"RbnBalan\" and password \"9043927392\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.user_entering_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicking login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.user_clicking_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verfiy user enter login into Adatn Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.verfiy_user_enter_login_into_Adatn_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
});