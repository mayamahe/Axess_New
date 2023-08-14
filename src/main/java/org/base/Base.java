package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void sendValues(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void clear(WebElement element) {
        element.clear();
    }

    public static void jsClick(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);
    }

}
