package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox textBoxEmail = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox textBoxPass = new TextBox(By.xpath("//input[@type='password']"));
    public Button buttonLogin = new Button(By.xpath("//button[text()='Log in']"));
}
