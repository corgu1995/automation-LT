package com.example.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutFormPage {

  WebDriver driver;

  @FindBy(id = "first-name")
  WebElement firstNameBox;

  @FindBy(id = "last-name")
  WebElement lastNameBox;

  @FindBy(id = "postal-code")
  WebElement postalCodeBox;

  @FindBy(id = "continue")
  WebElement continueBtn;

  public CheckoutFormPage(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void setFirstName(String firstName) {

    firstNameBox.sendKeys(firstName);
  }

  public void setLastName(String lastName) {

    lastNameBox.sendKeys(lastName);
  }

  public void setPostalCode(String postalCode) {

    postalCodeBox.sendKeys(postalCode);
  }

  public void clickContinue() {

    continueBtn.click();
  }

  /**
   * Fill login form
   *
   * @param firstName user firstName required
   * @param lastName user lastName required
   * @param postalCode postal code required
   * @return void
   */
  public void fillData(String firstName, String lastName, String postalCode) {
    setFirstName(firstName);
    setLastName(lastName);
    setPostalCode(postalCode);
  }
}
