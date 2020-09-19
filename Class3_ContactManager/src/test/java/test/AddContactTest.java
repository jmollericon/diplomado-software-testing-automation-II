package test;

import activity.contactManager.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class AddContactTest {
    MainActivity addContactActivity = new MainActivity();

    @Test
    public void verifyAddNumbers() throws MalformedURLException {
        addContactActivity.addContactButton.click();

        // Verification
        //String actualResult = calculatorActivity.resultLabel.getText();
        //String expectedResult = "7";
        //Assert.assertEquals("Error, the sum is wrong.",expectedResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        //Session.getInstance().closeSession();
    }
}
