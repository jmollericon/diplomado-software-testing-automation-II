package activity;

import appiumControl.*;
import org.openqa.selenium.By;

public class HomeActivity {

    public Button addTodoButton;
    public Button itemTodoDeleteButton;

    public HomeActivity() {
        addTodoButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        String titleTodoDelete = "todo1";
        itemTodoDeleteButton = new Button(By.xpath("//android.widget.TextView[@text='"+titleTodoDelete+"']"));
    }

    public boolean isDisplayedTodo(String titleTodo) {
        String locator = "//android.widget.TextView[@text='"+titleTodo+"']";
        Label title = new Label(By.xpath(locator));
        return title.isDisplayed();
    }
}
