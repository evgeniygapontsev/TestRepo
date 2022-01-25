package pages.BookStore;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import wrappers.InputBookstore;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class RegisterPage {
    static Faker faker;

    public void registerToStore() {
        faker = new Faker();
        new InputBookstore("firstname").addToForm("Andy");
        new InputBookstore("lastname").addToForm("Dufraine");
        new InputBookstore("userName").addToForm("dumby");
        new InputBookstore("password").addToForm("Abc-$1234");
        switchTo().frame($("#g-recaptcha iframe"));
        $("#recaptcha-anchor").click();
        switchTo().defaultContent();
        Configuration.timeout = 6000;
        $(By.xpath("//button[contains(text(), 'Register')]")).click();
//        switchTo().alert().accept();
    }

    public void backToLogin() {
        $("#gotologin").click();
    }
}
