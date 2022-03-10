package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class LogoutTestTodoist extends BaseTodoist{
    TopFirstPage topFirstPage = new TopFirstPage();
    LoginPage loginPage = new LoginPage();
    String email = "erickmartinezcrypto123@gmail.com";
    String pass = "Erickmartinezcrypto123#";

    LogoutPage logoutPage = new LogoutPage();

    @Test
    public void logout(){
        topFirstPage.buttonLogin.click();

        loginPage.textBoxEmail.setText(email);
        loginPage.textBoxPass.setText(pass);
        loginPage.buttonLogin.click();

        logoutPage.buttonAvatarMenu.click();
        logoutPage.buttonLogout.click();
    }
}
