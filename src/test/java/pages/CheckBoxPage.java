package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    public void checkIn() {
        $(By.xpath("//span[contains(text() , 'Desktop')]")).click();
        Assert.assertTrue("You have selected: desktop notes commands", true);
        $(By.xpath("//span[contains(text() , 'Home')]")).click();
        Assert.assertTrue("You have selected :home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile", true);
    }

    public void expandAll() {
        $(By.xpath("//button[contains(@title, 'Expand all')]")).click();
    }

    public void collapseAll() {
        $(By.xpath("//button[contains(@title, 'Collapse all')]")).click();
    }
}
