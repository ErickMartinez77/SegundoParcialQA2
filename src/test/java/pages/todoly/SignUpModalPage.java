package pages.todoly;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpModalPage {
    public TextBox textBoxFullName = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxFullName']"));
    public TextBox textBoxEmail = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxEmail']"));
    public TextBox textBoxPassword = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxPassword']"));
    public CheckBox checkBoxTerms = new CheckBox(By.xpath("//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms']"));
    public Button signUpButton = new Button(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$ButtonSignup']"));
}
