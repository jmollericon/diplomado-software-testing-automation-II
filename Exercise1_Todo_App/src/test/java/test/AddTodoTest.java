package test;

import activity.FormAddTodoActivity;
import activity.HomeActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class AddTodoTest {
    HomeActivity homeActivity = new HomeActivity();
    FormAddTodoActivity formAddTodoActivity = new FormAddTodoActivity();

    @Test
    public void verifyAddTodo() throws MalformedURLException {
        String titleTodo = "todo1";
        String notesTodo = "nota de mi todo";
        homeActivity.addTodoButton.click();

        formAddTodoActivity.todoTitleTextBox.sendKeys(titleTodo);
        formAddTodoActivity.todoNotesTextBox.sendKeys(notesTodo);
        formAddTodoActivity.saveTodoButton.click();

        // Verification
        Assert.assertTrue("Error, TODO isn't created.", homeActivity.isDisplayedTodo(titleTodo));
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
