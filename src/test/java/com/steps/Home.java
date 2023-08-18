package com.steps;

import com.runner.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pages.HomePage;

public class Home extends Base {

    public static WebDriver driver = Runner.driver;
    public static HomePage home = new HomePage(driver);


    @Given("launch the application")
    public void launch_the_application() {
       max(driver);
       url(driver,"https://www.amazon.in/");
    }
    @Then("verify the homepage")
    public void verify_the_homepage() {
        Assert.assertEquals( getAttribute(home.getHomePageLogo(),"aria-label"),"Amazon.in");
    }


}
