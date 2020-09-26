package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ConfirmDeleteTodoActivity {
    public Button confirmDeleteTodoButton;

    public ConfirmDeleteTodoActivity() {
        confirmDeleteTodoButton = new Button(By.id("android:id/button1"));
    }
}
