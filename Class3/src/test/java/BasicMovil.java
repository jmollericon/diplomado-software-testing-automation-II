import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

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
    }
    @Test
    public void myFirstTest(){
        System.out.println("my first test...");
    }
    @Test
    public void mySecondTest(){
        System.out.println("my second test...");
    }
    @After
    public void after() {
        System.out.println("after");
    }
}
