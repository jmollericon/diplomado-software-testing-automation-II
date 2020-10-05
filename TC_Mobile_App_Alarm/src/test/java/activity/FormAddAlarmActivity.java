package activity;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class FormAddAlarmActivity {
    public CheckBox repeatCheckBox;
    public TextBox nameAlarmTextBox;
    public Button okButton;
    public Button cancelButton;

    public FormAddAlarmActivity() {
        repeatCheckBox = new CheckBox(By.id("com.better.alarm:id/details_repeat_row"));
        nameAlarmTextBox = new TextBox(By.id("com.better.alarm:id/details_label"));
        okButton = new Button(By.id("com.better.alarm:id/details_activity_button_save"));
        cancelButton = new Button(By.id("com.better.alarm:id/details_activity_button_revert"));
    }
}
