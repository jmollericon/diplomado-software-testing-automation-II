package activity;

import appiumControl.Button;
import appiumControl.ComboBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class FormAddContactActivity {
    public ComboBox targetAccountComboBox;
    public TextBox contactNameTextBox;
    public TextBox contactPhoneTextBox;
    public TextBox contactEmailTextBox;
    public Button saveContactButton;

    public FormAddContactActivity() {
        targetAccountComboBox = new ComboBox(By.id("com.example.android.contactmanager:id/accountSpinner"));
        contactNameTextBox = new TextBox(By.id("com.example.android.contactmanager:id/contactNameEditText"));
        contactPhoneTextBox = new TextBox(By.id("com.example.android.contactmanager:id/contactPhoneEditText"));
        contactEmailTextBox = new TextBox(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
        saveContactButton = new Button(By.id("com.example.android.contactmanager:id/contactSaveButton"));
        
    }
}
