package pages.BookStore;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import wrappers.InputBookstore;

import static com.codeborne.selenide.Selenide.*;

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
        switchTo().parentFrame();
        Configuration.timeout = 10000;
//        $x("//button[contains(text(), 'Register')]").scrollTo();
//        Configuration.timeout = 15000;
//        $x("//button[contains(text(), 'Register')]").click();
//        switchTo().alert().accept();
    }

    public void clickOnRegister() {
        $x("//button[contains(text(), 'Register')]").scrollTo();
        Configuration.timeout = 10000;
        $x("//button[contains(text(), 'Register')]").click();
        switchTo().alert().accept();
    }

    public void backToLogin() {
        $("#gotologin").click();
    }
}
