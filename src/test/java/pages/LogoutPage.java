package pages;

import control.Button;
import org.openqa.selenium.By;

public class LogoutPage {
    public Button buttonAvatarMenu = new Button(By.xpath("//button[@class='reactist_menubutton top_bar_btn settings_btn']"));
    public Button buttonLogout = new Button(By.xpath("//div[@class='reactist_menulist user_menu']//button[2]"));
}
