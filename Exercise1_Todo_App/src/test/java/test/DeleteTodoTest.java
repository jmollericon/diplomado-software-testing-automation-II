package test;

import activity.ConfirmDeleteTodoActivity;
import activity.FormAddTodoActivity;
import activity.FormEditTodoActivity;
import activity.HomeActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class DeleteTodoTest {
    HomeActivity homeActivity = new HomeActivity();
    FormAddTodoActivity formAddTodoActivity = new FormAddTodoActivity();
    FormEditTodoActivity formEditTodoActivity = new FormEditTodoActivity();
    ConfirmDeleteTodoActivity confirmDeleteTodoActivity = new ConfirmDeleteTodoActivity();

    @Test
    public void verifyDeleteTodo() throws MalformedURLException {
        // create TODO
        String titleTodo = "todo1";
        String notesTodo = "nota de mi todo";
        homeActivity.addTodoButton.click();

        formAddTodoActivity.todoTitleTextBox.sendKeys(titleTodo);
        formAddTodoActivity.todoNotesTextBox.sendKeys(notesTodo);
        formAddTodoActivity.saveTodoButton.click();

        // delete TODO
        homeActivity.itemTodoDeleteButton.click();
        formEditTodoActivity.deleteTodoButton.click();
        confirmDeleteTodoActivity.confirmDeleteTodoButton.click();

        // Verification
        Assert.assertFalse("Error, TODO isn't deleted.", homeActivity.isDisplayedTodo(titleTodo));
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
