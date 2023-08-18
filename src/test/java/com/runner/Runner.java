package com.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\IdeaProjects\\Axess_Prac\\src\\test\\resources\\features",
        glue = "com.steps",
        monochrome = true,
        dryRun = false,
        tags = "@TC-01"
)

public class Runner {

    public static WebDriver driver;
    @BeforeClass
    public static void start(){
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(op);
    }

    @AfterClass
    public static void end(){
//        driver.quit();
    }

}
