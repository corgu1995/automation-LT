package com.example.saucedemo.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverInstance {

  // instance of singleton class
  private static DriverInstance instanceOfBrowser = null;

  private final WebDriver driver;

  private DriverInstance() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  public static DriverInstance getInstanceOfBrowser() {
    return instanceOfBrowser == null ? instanceOfBrowser = new DriverInstance() : instanceOfBrowser;
  }

  public WebDriver getDriver() {
    return driver;
  }
}
