package com.example.saucedemo.bussiness_logic;

import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.CartPage;
import com.example.saucedemo.pages.CheckoutFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutFormLogic implements Actions {

  DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
  WebDriver driver = driverInstance.getDriver();
  CheckoutFormPage checkoutFormPage = new CheckoutFormPage(driver);

  @Override
  public void goToPage(String url) {
    driver.get(url);
  }

  public void fillFormAndContinue(String firstName, String lastName, String postalCode) {
    checkoutFormPage.fillData(firstName, lastName, postalCode);
    checkoutFormPage.clickContinue();
  }
}
