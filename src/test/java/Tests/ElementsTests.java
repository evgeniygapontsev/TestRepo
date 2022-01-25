package Tests;

import org.junit.Test;
import pages.*;
import pages.BookStore.BookStorePage;
import pages.BookStore.LoginPage;
import pages.BookStore.ProfilePage;
import pages.BookStore.RegisterPage;

import static com.codeborne.selenide.Selenide.open;

public class ElementsTests extends BaseTest {
    String baseUrl = "https://demoqa.com/";

    @Test
    public void textBox() {
        open(baseUrl + "text-box");
        new TextBoxPage().textIn("Billy", "bb@mail.ru", "Minsk, Surganova,23", "Soligorsk, Lenina,10");
    }

    @Test
    public void checkBox() {
        open(baseUrl + "checkbox");
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.expandAll();
        checkBoxPage.checkIn();
        checkBoxPage.collapseAll();
    }

    @Test
    public void radioButton() {
        open(baseUrl + "radio-button");
        new RadioButtonPage().radioCheckbox();
    }

    @Test
    public void buttons() {
        open(baseUrl + "buttons");
        new ButtonsPage().differentClicks();
    }

    @Test
    public void webTables() {
        open(baseUrl + "webtables");
        WebTablesPage webTablesPage = new WebTablesPage();
        webTablesPage
                .addNewRecord()
                .isCreated()
                .updateRecord()
                .deleteRecord();
    }

    @Test
    public void registerOnBookstore() {
        open(baseUrl + "login");
        LoginPage loginPage = new LoginPage();
        ProfilePage profilePage = new ProfilePage();
        BookStorePage bookStorePage = new BookStorePage();
        RegisterPage registerPage = new RegisterPage();
        loginPage
                .newUser()
                .registerToStore();
        registerPage.backToLogin();
        loginPage.login("dumby", "Abc-$1234");
//        profilePage.bookStore();
//        bookStorePage.chooseBook("Learning JavaScript Design Patterns");

    }

    @Test
    public void loginOnBookstore() {
        open(baseUrl + "login");
        LoginPage loginPage = new LoginPage();
        ProfilePage profilePage = new ProfilePage();
        BookStorePage bookStorePage = new BookStorePage();
        loginPage.login("dumby", "Abc-$1234");
        profilePage.bookStore();
        bookStorePage.chooseBook("Learning JavaScript Design Patterns");

    }
}
