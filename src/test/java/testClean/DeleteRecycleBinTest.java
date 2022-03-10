package testClean;

import io.cucumber.gherkin.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.FirstTodolyPage;
import pages.todoly.MainTodolyPage;
import pages.todoly.SignUpModalPage;

public class DeleteRecycleBinTest extends BaseTodoly{
    FirstTodolyPage firstTodolyPage = new FirstTodolyPage();
    SignUpModalPage signUpModalPage = new SignUpModalPage();
    String fullName = "ErickFull13";
    String email = "erickfull13@gmail.com";
    String pass = "123";
    MainTodolyPage mainTodolyPage = new MainTodolyPage();
    String noItems = "There are no items to display";
    @Test
    public void deleteRecycleBin(){
        firstTodolyPage.signUpButton.click();

        signUpModalPage.textBoxFullName.setText(fullName);
        signUpModalPage.textBoxEmail.setText(email);
        signUpModalPage.textBoxPassword.setText(pass);
        signUpModalPage.checkBoxTerms.click();
        signUpModalPage.signUpButton.click();

        mainTodolyPage.recycleBinButton.click();
        mainTodolyPage.optionRecycleButton.click();
        mainTodolyPage.emptyRecycleButton.click();
        Assertions.assertFalse(mainTodolyPage.subTextNoItemsToDisplay.isControlDisplayed());
        //System.out.println(mainTodolyPage.subTextNoItemsToDisplay.isControlDisplayed());
    }
}
