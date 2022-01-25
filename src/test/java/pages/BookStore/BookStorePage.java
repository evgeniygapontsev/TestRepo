package pages.BookStore;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BookStorePage {

    public void goToProfile() {
        $("#item-3").click();
    }

    public void chooseBook(String name) {
        $$(By.className("rt-tbody")).findBy(Condition.exactText(name)).click();

    }
}
