package com.example.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
  WebDriver driver;

  @FindBy(xpath = "//*[@id='item_4_title_link']/div")
  WebElement onesieProductTxt;

  @FindBy(id = "checkout")
  WebElement confirmCheckoutBtn;

  public CartPage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getProductName() {

    return onesieProductTxt.getText();
  }

  public void confirmCheckout() {
    confirmCheckoutBtn.click();
  }
}
