package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class FormEditTodoActivity {
    public Button deleteTodoButton;

    public FormEditTodoActivity() {
        deleteTodoButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    }
}
