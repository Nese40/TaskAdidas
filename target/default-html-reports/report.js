$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/purchase.feature");
formatter.feature({
  "name": "purchase product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@purchase"
    }
  ]
});
formatter.scenario({
  "name": "Customer can purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@purchase"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the customer is on the homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_is_on_the_homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  navigates to \"Laptops\" \"Sony vaio i5\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Add to cart\" and accept pop up",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_clicks_on_and_accept_pop_up(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Home\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  navigates to \"Laptops\" \"Dell i7 8gb\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Add to cart\" and accept pop up",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_clicks_on_and_accept_pop_up(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Cart\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  deletes \"Dell i7 8gb\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_deletes(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Place Order\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.customer_click_on_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"name\" field \"Nese\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"country\" field \"Turkey\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"city\" field \"Istanbul\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"card\" field \"1235447\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"month\" field \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  fills \"year\" field \"2023\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_fills_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"Purchase\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.customer_click_on_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  captures and logs purchase Id and Amount",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.the_customer_captures_and_logs_purchase_Id_and_Amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "purchase amount equals expected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.purchase_amount_equals_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer  clicks on \"OK\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adidas.step_definitions.PurchaseStepDefs.customer_click_on_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});