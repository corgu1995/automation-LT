package com.example.saucedemo.bussiness_logic;

import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.HomePage;
import com.example.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class HomeLogic implements Actions {

  DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
  WebDriver driver = driverInstance.getDriver();
  HomePage homePage = new HomePage(driver);

  @Override
  public void goToPage(String url) {
    driver.get(url);
  }

  public String addProductToCart() {
    return homePage.addToCart();
  }

  public void goToCart() {
    homePage.goToCart();
  }
}
