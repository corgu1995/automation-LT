package com.example.saucedemo.bussiness_logic;

import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.CartPage;
import com.example.saucedemo.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartLogic implements Actions {

  DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
  WebDriver driver = driverInstance.getDriver();
  CartPage cartPage = new CartPage(driver);

  @Override
  public void goToPage(String url) {
    driver.get(url);
  }

  public void processCheckout(String productName) {
    Assert.assertEquals(cartPage.getProductName(), productName, "Product name is not as expected");
    cartPage.confirmCheckout();
  }
}
