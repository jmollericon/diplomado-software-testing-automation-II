package appiumControl;

import org.openqa.selenium.By;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) {
        this.control.sendKeys(value);
    }
}
