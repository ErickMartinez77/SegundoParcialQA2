package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.FirstTodolyPage;
import pages.todoly.SignUpModalPage;

public class DeleteRecycleBinTest extends BaseTodoly{
    FirstTodolyPage firstTodolyPage = new FirstTodolyPage();
    SignUpModalPage signUpModalPage = new SignUpModalPage();
    String fullName = "ErickFull3";
    String email = "erickfull3@gmail.com";
    String pass = "123";
    @Test
    public void deleteRecycleBin(){
        firstTodolyPage.signUpButton.click();

        signUpModalPage.textBoxFullName.setText(fullName);
        signUpModalPage.textBoxEmail.setText(email);
        signUpModalPage.textBoxPassword.setText(pass);
        signUpModalPage.checkBoxTerms.click();
        signUpModalPage.signUpButton.click();
        Assertions.assertFalse(firstTodolyPage.signUpButton.isControlDisplayed());
    }
}
