package activity;

import appiumControl.*;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addContactButton;

    public MainActivity() {
        addContactButton = new Button(By.id("com.example.android.contactmanager:id/addContactButton"));
    }

    public boolean isDisplayedContact(String nameContact) {
        String locator = "//android.widget.TextView[@text='"+nameContact+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}
