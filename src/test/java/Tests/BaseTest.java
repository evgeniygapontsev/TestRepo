package Tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 60000;
        Configuration.browser = "chrome";
//        Configuration.baseUrl = "https://demoqa.com/automation-practice-form";
        Configuration.startMaximized = true;
    }

}
