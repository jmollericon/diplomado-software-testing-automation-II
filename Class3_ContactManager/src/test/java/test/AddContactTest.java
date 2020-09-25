package test;

import activity.FormAddContactActivity;
import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class AddContactTest {
    MainActivity mainActivity = new MainActivity();
    FormAddContactActivity formAddContactActivity = new FormAddContactActivity();

    @Test
    public void verifyAddContact() throws MalformedURLException {
        String nameContact = "1_pepito";

        mainActivity.addContactButton.click();

        //formAddContactActivity.targetAccountComboBox.click();

        formAddContactActivity.contactNameTextBox.sendKeys(nameContact);
        formAddContactActivity.contactPhoneTextBox.sendKeys("222222");
        formAddContactActivity.contactEmailTextBox.sendKeys("pepito@email.com");
        formAddContactActivity.saveContactButton.click();

        // Verification
        Assert.assertTrue("Error, the contact isn't created.", mainActivity.isDisplayedContact(nameContact));
    }

    @After
    public void after() throws MalformedURLException {
        //Session.getInstance().closeSession();
    }
}
