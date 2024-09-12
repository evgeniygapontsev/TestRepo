package pages.BookStore;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.empty;
import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {

    public void logout() {
        $(By.xpath("//button[contains(text(), 'Log out')]")).click();
    }

    public void deleteAllBooks() {
        $(By.xpath("//div[@class='text-right button di']//*[contains(text(), 'Delete All Books')]")).click();
        Configuration.timeout = 6000;
        switchTo().alert();
        $("#closeSmallModal-ok").click();
        switchTo().alert().accept();
    }

    public void bookStore() {
        $("#gotoStore").click();
    }

    public void bookWasAdded() {
        $$(By.className("ReactTable")).shouldHave(CollectionCondition.texts("Learning JavaScript Design Patterns"));
    }

    public void bookWasDeleted() {
        $$(By.className("ReactTable")).shouldBe(empty);

    }

    public void deleteAccount() {
        $x("//*[contains(text(), 'Delete Account')]").click();
        switchTo().alert();
        $("#closeSmallModal-ok").click();
        switchTo().alert().accept();
    }
}
