package com.example.saucedemo.bussiness_logic;

import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.CheckoutFormPage;
import com.example.saucedemo.pages.CheckoutOverviewPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutOverviewLogic implements Actions {

  DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
  WebDriver driver = driverInstance.getDriver();
  CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);

  @Override
  public void goToPage(String url) {
    driver.get(url);
  }

  public void validateAndFinish(String productName) {
    Assert.assertEquals(
        checkoutOverviewPage.getProductName(), productName, "Product name is not as expected");
    checkoutOverviewPage.finishCheckout();
  }

  public void checkFinishedOrder() {
    Assert.assertTrue(
        driver.getCurrentUrl().contains("checkout-complete"), "Checkout didn't finish");
  }
}
