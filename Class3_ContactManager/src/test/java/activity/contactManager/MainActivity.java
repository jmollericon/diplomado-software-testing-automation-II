package activity.contactManager;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addContactButton;

    public MainActivity() {
        addContactButton = new Button(By.id("com.example.android.contactmanager:id/addContactButton"));
    }

}
