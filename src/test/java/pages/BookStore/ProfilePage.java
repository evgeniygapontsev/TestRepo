package pages.BookStore;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    public void logout() {
        $(By.xpath("//button[contains(text(), 'Log out')]")).click();
    }

    public void deleteAllBooks() {
        $(By.xpath("//div[@class='text-right button di']//button[contains(text(), 'Delete All Books')]")).click();
    }

    public void bookStore() {
        $("#gotoStore").click();
    }
}
