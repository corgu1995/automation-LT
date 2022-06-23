package com.example.saucedemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"com/example/saucedemo/steps"},
    plugin = {"pretty", "html:target/saucedemo-report.html"})
public class Runner {}
