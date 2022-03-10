package testClean;

import org.junit.jupiter.api.BeforeEach;
import singleton.Session;

public class BaseTodoist {
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("http://todoist.com");
    }

    //@AfterEach
    //public void closeBrowser(){
    //    Session.getInstance().closeSession();
    //}
}
