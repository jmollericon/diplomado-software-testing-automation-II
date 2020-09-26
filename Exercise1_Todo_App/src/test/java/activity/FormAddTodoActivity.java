package activity;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class FormAddTodoActivity {
    public TextBox todoTitleTextBox;
    public TextBox todoNotesTextBox;
    public Button saveTodoButton;

    public FormAddTodoActivity() {
        todoTitleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        todoNotesTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveTodoButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
