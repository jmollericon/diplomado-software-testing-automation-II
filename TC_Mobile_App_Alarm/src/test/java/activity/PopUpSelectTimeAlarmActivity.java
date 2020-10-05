package activity;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class PopUpSelectTimeAlarmActivity {
    public Button deleteButton;
    public Button bOneButton;
    public Button bTwoButton;
    public Button bThreeButton;
    public Button bFourButton;
    public Button bFiveButton;
    public Button bSixButton;
    public Button bSevenButton;
    public Button bEightButton;
    public Button bNineButton;
    public Button bZeroButton;
    public Button bAmButton;
    public Button bPmButton;
    public Button okButton;
    public Button cancelButton;

    public PopUpSelectTimeAlarmActivity() {
        deleteButton = new Button(By.id("com.better.alarm:id/delete"));
        bOneButton = new Button(By.xpath("//android.widget.LinearLayout[2]/android.widget.Button[1]"));
        bTwoButton = new Button(By.xpath("//android.widget.LinearLayout[2]/android.widget.Button[2]"));
        bThreeButton = new Button(By.xpath("//android.widget.LinearLayout[2]/android.widget.Button[3]"));
        bFourButton = new Button(By.xpath("//android.widget.LinearLayout[3]/android.widget.Button[1]"));
        bFiveButton = new Button(By.xpath("//android.widget.LinearLayout[3]/android.widget.Button[2]"));
        bSixButton = new Button(By.xpath("//android.widget.LinearLayout[3]/android.widget.Button[3]"));
        bSevenButton = new Button(By.xpath("//android.widget.LinearLayout[4]/android.widget.Button[1]"));
        bEightButton = new Button(By.xpath("//android.widget.LinearLayout[4]/android.widget.Button[2]"));
        bNineButton = new Button(By.xpath("//android.widget.LinearLayout[4]/android.widget.Button[3]"));
        bAmButton = new Button(By.xpath("//android.widget.LinearLayout[5]/android.widget.Button[1]"));
        bZeroButton = new Button(By.xpath("//android.widget.LinearLayout[5]/android.widget.Button[2]"));
        bPmButton = new Button(By.xpath("//android.widget.LinearLayout[5]/android.widget.Button[3]"));
        okButton = new Button(By.id("com.better.alarm:id/set_button"));
        cancelButton = new Button(By.id("com.better.alarm:id/cancel_button"));
    }
}
