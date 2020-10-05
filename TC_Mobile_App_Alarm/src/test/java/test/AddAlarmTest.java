package test;

import activity.FormAddAlarmActivity;
import activity.PopUpSelectRepeatAlarmActivity;
import activity.PopUpSelectTimeAlarmActivity;
import activity.HomeActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class AddAlarmTest {
    HomeActivity homeActivity = new HomeActivity();
    PopUpSelectTimeAlarmActivity popUpSelectTimeAlarmActivity = new PopUpSelectTimeAlarmActivity();
    FormAddAlarmActivity formAddAlarmActivity = new FormAddAlarmActivity();
    PopUpSelectRepeatAlarmActivity popUpSelectRepeatAlarmActivity = new PopUpSelectRepeatAlarmActivity();

    @Test
    public void verifyAddNewAlarm() throws MalformedURLException {
        // click adicionar nueva alarma
        homeActivity.addAlarmButton.click();

        // crear alarma para las 6:55 PM
        String time_alarm = "6:55";
        popUpSelectTimeAlarmActivity.bSixButton.click();
        popUpSelectTimeAlarmActivity.bFiveButton.click();
        popUpSelectTimeAlarmActivity.bEightButton.click();
        popUpSelectTimeAlarmActivity.deleteButton.click();
        popUpSelectTimeAlarmActivity.bFiveButton.click();
        popUpSelectTimeAlarmActivity.bPmButton.click();
        popUpSelectTimeAlarmActivity.okButton.click();

        // que alarma se repital los jueves y viernes
        formAddAlarmActivity.repeatCheckBox.click();
        popUpSelectRepeatAlarmActivity.thursdayButton.click();
        popUpSelectRepeatAlarmActivity.fridayButton.click();
        popUpSelectRepeatAlarmActivity.okButton.click();

        // adicionar un nombre a la alarma
        String label_alarm = "Clases Diplomado UCB";
        formAddAlarmActivity.nameAlarmTextBox.sendKeys(label_alarm);

        // Crear alarma
        formAddAlarmActivity.okButton.click();

        // Verificación de la alarma creada (hora y nota (nombre) de la alarma)
        Assert.assertTrue("Error, alarma no creada!.", homeActivity.isDisplayedAlarm(time_alarm, label_alarm));
    }

    @After
    public void after() throws MalformedURLException {
        //Session.getInstance().closeSession();
    }
}
