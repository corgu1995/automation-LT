package com.example.saucedemo.bussiness_logic;

import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginLogic implements Actions {

  DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
  WebDriver driver = driverInstance.getDriver();
  LoginPage loginPage = new LoginPage(driver);

  @Override
  public void goToPage(String url) {
    driver.get(url);
  }

  public void login(String username, String password) {
    loginPage.fillData(username, password);
    loginPage.clickLogin();
  }
}
