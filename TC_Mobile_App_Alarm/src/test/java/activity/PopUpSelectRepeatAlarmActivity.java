package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class PopUpSelectRepeatAlarmActivity {
    public Button mondayButton;
    public Button tuesdayButton;
    public Button wednesdayButton;
    public Button thursdayButton;
    public Button fridayButton;
    public Button saturdayButton;
    public Button sundayButton;
    public Button okButton;

    public PopUpSelectRepeatAlarmActivity() {
        mondayButton = new Button(By.xpath("//android.widget.CheckedTextView[1]"));
        tuesdayButton = new Button(By.xpath("//android.widget.CheckedTextView[2]"));
        wednesdayButton = new Button(By.xpath("//android.widget.CheckedTextView[3]"));
        thursdayButton = new Button(By.xpath("//android.widget.CheckedTextView[4]"));
        fridayButton = new Button(By.xpath("//android.widget.CheckedTextView[5]"));
        saturdayButton = new Button(By.xpath("//android.widget.CheckedTextView[6]"));
        sundayButton = new Button(By.xpath("//android.widget.CheckedTextView[7]"));
        okButton = new Button(By.id("android:id/button1"));
    }
}
