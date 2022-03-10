package testClean;

import org.junit.jupiter.api.BeforeEach;
import singleton.Session;

public class BaseTodoly {
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("http://todoly.com");
    }
}
