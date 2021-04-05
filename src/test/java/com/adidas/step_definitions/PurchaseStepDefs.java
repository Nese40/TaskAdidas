package com.adidas.step_definitions;

import com.adidas.pages.CartPage;
import com.adidas.pages.LaptopsPage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class PurchaseStepDefs {


    LaptopsPage laptopsPage=new LaptopsPage();
    CartPage cartPage=new CartPage();


    @Given("the customer is on the homePage")
    public void the_customer_is_on_the_homePage() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }


    @When("the customer  navigates to {string} {string}")
    public void the_customer_navigates_to(String category,String product) {

        BrowserUtils.waitFor(1);
        laptopsPage.navigateTo(category,product);

    }

    @Then("the customer  clicks on {string} and accept pop up")
    public void the_customer_clicks_on_and_accept_pop_up(String product) {

        Driver.get().findElement(By.linkText(product)).click();

        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

    @Then("the customer  clicks on {string}")
    public void the_customer_clicks_on(String module) {

        BrowserUtils.waitFor(1);
        laptopsPage.moduleNames(module);

    }

    @Then("the customer  deletes {string}")
    public void the_customer_deletes(String deleteProduct) {
        BrowserUtils.waitFor(1);
        cartPage.delete(deleteProduct);

    }

    @Then("the customer  clicks on {string} button")
    public void customer_click_on_button(String button) {
        BrowserUtils.waitFor(1);

        cartPage.clickButton(button);

    }
    @Then("the customer  fills {string} field {string}")
    public void the_customer_fills_field(String info,String value) {
        BrowserUtils.waitFor(1);

        cartPage.getInformation(info,value);

    }
    @Then("the customer  captures and logs purchase Id and Amount")
    public void the_customer_captures_and_logs_purchase_Id_and_Amount() {
        int id = cartPage.getID();
        int price = cartPage.getPrice();
        System.out.println("Id = " + id);
        System.out.println("Amount = " + price);

    }
    @Then("purchase amount equals expected")
    public void purchase_amount_equals_expected() {
        int actualResult =  cartPage.getPrice();
        Assert.assertEquals(cartPage.getExpectedPrice(),actualResult);

    }











}
