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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseStepDefs {
    WebDriverWait wait =new WebDriverWait(Driver.get(),30);

    LaptopsPage laptopsPage=new LaptopsPage();
    CartPage cartPage=new CartPage();


    @Given("the customer is on the homePage")
    public void the_customer_is_on_the_homePage() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Then("the customer  clicks on {string}")
    public void the_customer_clicks_on(String product) {

        BrowserUtils.waitFor(1);
        laptopsPage.searchProduct(product);

    }

    @Then("the customer  Accept pop up confirmation")
    public void the_customer_Accept_pop_up_confirmation() {
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

    @When("the customer clicks Home button to return to the HomePage")
    public void the_customer_clicks_Home_button_to_return_to_the_HomePage() {

        wait.until(ExpectedConditions.visibilityOf(cartPage.homePageModule));
        cartPage.homePageModule.click();

    }
    @Then("the customer  deletes {string}")
    public void the_customer_deletes(String deleteProduct) {
        BrowserUtils.waitFor(1);
        cartPage.delete(deleteProduct);

    }
    @Then("the customer  clicks on Place order button")
    public void customer_click_on_Place_order() {
        BrowserUtils.waitFor(1);
        cartPage.placeOrder.click();

    }
    @Then("the customer  fills in all web form fields and click Purchase")
    public void the_customer_fills_in_all_web_form_fields_and_click_Purchase() {
        BrowserUtils.waitFor(2);
        cartPage.getInformation();

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
    @Then("the customer  clicks on Ok")
    public void the_customer_clicks_on_Ok() {
        BrowserUtils.waitFor(1);
        cartPage.okButton.click();
    }











}
