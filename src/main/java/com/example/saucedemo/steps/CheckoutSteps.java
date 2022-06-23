package com.example.saucedemo.steps;

import com.example.saucedemo.bussiness_logic.*;
import com.example.saucedemo.driver.DriverInstance;
import com.example.saucedemo.pages.CheckoutOverviewPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

  WebDriver driver;
  LoginLogic loginLogic = new LoginLogic();
  HomeLogic homeLogic = new HomeLogic();
  CartLogic cartLogic = new CartLogic();
  CheckoutFormLogic checkoutFormLogic = new CheckoutFormLogic();
  CheckoutOverviewLogic checkoutOverviewLogic = new CheckoutOverviewLogic();
  String loginUrl = "https://www.saucedemo.com/";
  String productName = StringUtils.EMPTY;

  @Before("@CheckoutTest")
  public void setUp() {
    DriverInstance driverInstance = DriverInstance.getInstanceOfBrowser();
    driver = driverInstance.getDriver();
    driver.manage().window().maximize();
  }

  @Given("^User login into saucedemo with (.*) and (.*)$")
  public void userLoginIntoSaucedemoWithUsernameAndPassword(String username, String password) {
    loginLogic.goToPage(loginUrl);
    loginLogic.login(username, password);
  }

  @When("^User adds a product to the cart$")
  public void userAddsAProductToTheCart() {
    productName = homeLogic.addProductToCart();
    homeLogic.goToCart();
    cartLogic.processCheckout(productName);
  }

  @When("^Fill the required form with (.*), (.*) and(.*)$")
  public void fillTheRequiredForm(String firstName, String lastName, String postalCode) {
    checkoutFormLogic.fillFormAndContinue(firstName, lastName, postalCode);
  }

  @Then("^Is able to finish the checkout process$")
  public void isAbleToFinishTheCheckoutProcess() {
    checkoutOverviewLogic.validateAndFinish(productName);
    checkoutOverviewLogic.checkFinishedOrder();
  }

  @After("@CheckoutTest")
  public void cleanUp() {
    driver.close();
    driver.quit();
  }
}
