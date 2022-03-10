package pages.todoly;

import control.Button;
import org.openqa.selenium.By;

public class MainTodolyPage {
    public Button recycleBinButton = new Button(By.xpath("//div[@id='OtherListPlaceHolder']"));
}
