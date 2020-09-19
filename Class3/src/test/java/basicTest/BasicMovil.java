package basicTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicMovil {

    private AppiumDriver driver;

    /* Desired Capabilities
    {
        "deviceName": "Xperia E5",
        "platformVersion": "6.0",
        "appPackage": "com.android.calculator2",
        "appActivity": ".Calculator",
        "platformName": "Android"
    } */

    @Before
    public void before() throws MalformedURLException {
        System.out.println("before");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Xperia E5");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("platformName", "Android");

        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // Implicit wait
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
    @Test
    public void add(){
        // Action + Cual elemento? + En donde está el elemente
        // Click on [Login] Button in Login Page
        // Press button 2
        this.driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        // Press button +
        this.driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        // Press button 5
        this.driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        // Press button =
        this.driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        // verification = 7
        String actualResult = this.driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        String expectedResult = "7";
        Assert.assertEquals("Error, the sum is wrong.",expectedResult, actualResult);
    }
    @Test
    public void mySecondTest(){
        System.out.println("my second test...");
    }
    @After
    public void after() {
        System.out.println("after");
        this.driver.quit();
    }
}
