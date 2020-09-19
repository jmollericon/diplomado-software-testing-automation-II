package test;

import activity.calculator.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CalculatorTest {
    MainActivity calculatorActivity = new MainActivity();

    @Test
    public void verifyAddNumbers() throws MalformedURLException {
        calculatorActivity.fiveButton.click();
        calculatorActivity.addButton.click();
        calculatorActivity.twoButton.click();
        calculatorActivity.equalButton.click();

        // Verification
        String actualResult = calculatorActivity.resultLabel.getText();
        String expectedResult = "7";
        Assert.assertEquals("Error, the sum is wrong.",expectedResult, actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
