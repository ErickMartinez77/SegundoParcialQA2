package pages.todoly;

import control.Button;
import control.ProjectName;
import control.RecycleBinSection;
import control.SubTextSection;
import org.openqa.selenium.By;

public class MainTodolyPage {
    public Button recycleBinButton = new Button(By.xpath("//li[@id='ItemId_-3']"));
    public Button optionRecycleButton = new Button(By.xpath("//div[@style='display: block;']//img"));
    public Button emptyRecycleButton = new Button(By.xpath("//a[@href='#emptyRecycle']"));
    public SubTextSection subTextNoItemsToDisplay = new SubTextSection(By.xpath("//div[text()='There are no items to display']"));

}
