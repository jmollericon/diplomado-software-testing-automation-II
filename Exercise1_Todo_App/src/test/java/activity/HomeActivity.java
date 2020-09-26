package activity;

import appiumControl.*;
import org.openqa.selenium.By;

public class HomeActivity {

    public Button addTodoButton;

    public HomeActivity() {
        addTodoButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }

    public boolean isDisplayedContact(String titleTodo) {
        String locator = "//android.widget.TextView[@text='"+titleTodo+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}
