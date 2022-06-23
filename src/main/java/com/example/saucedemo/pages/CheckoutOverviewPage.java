package com.example.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

  WebDriver driver;

  @FindBy(xpath = "//*[@id='item_4_title_link']/div")
  WebElement productNameTxt;

  @FindBy(id = "finish")
  WebElement finishBtn;

  public CheckoutOverviewPage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getProductName() {

    return productNameTxt.getText();
  }

  public void finishCheckout() {
    finishBtn.click();
  }
}
