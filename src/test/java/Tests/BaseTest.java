package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeAll
    public void setUp() {
        Configuration.timeout = 60000;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

}
