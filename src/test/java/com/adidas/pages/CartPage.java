package com.adidas.pages;

import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> table;

    @FindBy(css = "button.btn.btn-success")
    public WebElement placeOrder;


    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement creditCard;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    public WebElement purchase;

    @FindBy(css = "button.confirm.btn.btn-lg.btn-primary")
    public WebElement okButton;

    @FindBy(xpath = "//body/div[10]/p[1]")
    public WebElement confirmationPupUpBox;

    @FindBy(xpath = "//h3")
    public WebElement productPrice;

    public void delete(String deleteProduct){

        for (int i = 1; i <= table.size(); i++) {

            if (Driver.get().findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]")).getText().equals(deleteProduct)) {
                BrowserUtils.waitFor(2);

                Driver.get().findElement(By.xpath("//table/tbody/tr[" + i + "]/td[4]/a")).click();
                break;
            }
        }
    }

    public void getInformation(){

        name.sendKeys("Nese");
        country.sendKeys("Turkey");
        city.sendKeys("Istanbul");
        creditCard.sendKeys("21548796563");
        month.sendKeys("6");
        year.sendKeys("2024");
        BrowserUtils.waitFor(1);
        purchase.click();

    }

    public String getTextOfReport(){
        return confirmationPupUpBox.getText().replaceAll(" ","");
    }
    public int getID() {
        int indexOfAmount= getTextOfReport().indexOf("Amount");
        String id = getTextOfReport().substring(0,indexOfAmount).trim();
        int idNum = Integer.parseInt(id.replace("Id:",""));
        return idNum;
    }

    public int getPrice() {
        int indexOfCard = getTextOfReport().indexOf("Card");
        int indexOfAmount= getTextOfReport().indexOf("Amount");
        String amount = getTextOfReport().substring(indexOfAmount, indexOfCard).trim();
        int price = Integer.parseInt(amount.replace("Amount:", "").replace("USD","").trim());
        return price;
    }


    public int getExpectedPrice() {

        int price = Integer.parseInt(productPrice.getText());
        return price;
    }





}
