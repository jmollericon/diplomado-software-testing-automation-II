package activity;

import appiumControl.*;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomeActivity {

    public Button addAlarmButton;

    public HomeActivity() {
        addAlarmButton = new Button(By.id("com.better.alarm:id/fab"));
    }

    public boolean isDisplayedAlarm(String time_alarm, String label_alarm) {
        String locator_time_alarm = "//android.widget.TextView[@text='"+time_alarm+"']";
        String locator_label_alarm = "//android.widget.TextView[@text='"+label_alarm+"']";

        Label alarm_time = new Label(By.xpath(locator_time_alarm));
        Label alarm_label = new Label(By.xpath(locator_label_alarm));
        return alarm_time.isDisplayed() & alarm_label.isDisplayed();
    }
}
