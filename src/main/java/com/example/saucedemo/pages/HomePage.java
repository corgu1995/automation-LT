package com.example.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  WebDriver driver;

  @FindBy(xpath = "//*[@id='item_4_title_link']/div")
  WebElement onesieProductTxt;

  @FindBy(id = "add-to-cart-sauce-labs-backpack")
  WebElement addToCartBtnProduct;

  @FindBy(className = "shopping_cart_link")
  WebElement goToCartPage;

  public HomePage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getProductName() {

    return onesieProductTxt.getText();
  }

  public void addToTheCart() {
    addToCartBtnProduct.click();
  }

  public void goToCart() {
    goToCartPage.click();
  }

  /**
   * Add a product to the cart
   *
   * @return product name
   */
  public String addToCart() {
    addToTheCart();
    return getProductName();
  }
}
