package com.example.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  WebDriver driver;

  @FindBy(id = "user-name")
  WebElement usernameBox;

  @FindBy(id = "password")
  WebElement passwordBox;

  @FindBy(id = "login-button")
  WebElement loginBtn;

  public LoginPage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void setUsername(String username) {

    usernameBox.sendKeys(username);
  }

  public void setPassword(String pwd) {

    passwordBox.sendKeys(pwd);
  }

  public void clickLogin() {

    loginBtn.click();
  }

  /**
   * Fill login form
   *
   * @param userName username required
   * @param password password required
   * @return void
   */
  public void fillData(String userName, String password) {
    setUsername(userName);
    setPassword(password);
  }
}
