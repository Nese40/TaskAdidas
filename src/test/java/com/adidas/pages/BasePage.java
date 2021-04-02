package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='nav-link']")
    public WebElement homePageModule;


    public void searchProduct(String moduleName){
        Driver.get().findElement(By.linkText(moduleName)).click();
    }




}
