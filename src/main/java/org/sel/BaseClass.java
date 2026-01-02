package org.sel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class BaseClass {

    private static final ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return tdriver.get();

    }

    public static void browserLaunch() {
        WebDriver driver = new ChromeDriver();
        tdriver.set(driver);
        driver.manage().window().maximize();


    }

    public static void EdgebrowserLaunch(WebDriver driver) {
        WebDriver driver1 = new EdgeDriver();
        tdriver.set(driver1);
    }

    public static void launchUrl(String url) {
        getDriver().get(url);

    }

    public static void passvalue(WebElement ele, String val) {
        ele.sendKeys(val);

    }

    public static void implicitlywait(int sec) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }


    public static void click(WebElement ele) {
        ele.click();

    }

    public static void CustomizedXpathWithText(List<WebElement> allElementswithtext,
                                               String name, String value) {

        for (WebElement x : allElementswithtext) {
            String text = x.getText();

            if (text.equals(name)) {
                x.sendKeys(value);
            }

        }
    }


    public static void CustomizedXpathWithAttribute(List<WebElement> allElementswithtext,
                                                    String name, String value) {
        for (WebElement x : allElementswithtext) {
            String attribute = x.getAttribute("name");

            if (attribute.equals(name)) {
                x.sendKeys(value);
            }

        }
    }



    public static void windowHandle(String url) {
        getDriver().switchTo().window(url);


    }

    public static void QuitBrowser() {
        if (getDriver() != null) {
            getDriver().quit();

        }
    }
}

