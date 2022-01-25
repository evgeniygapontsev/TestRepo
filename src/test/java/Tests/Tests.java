package Tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Tests extends BaseTest {
    String baseUrl = "https://demoqa.com/automation-practice-form";

    @Test
    public void practiceFormTest() {

        open(baseUrl);
        $(By.id("firstName")).setValue("Bob");
        $(By.id("lastName")).setValue("Jankins");
        $(By.id("userEmail")).setValue("jankins@gmail.com");
        $(By.xpath("//label[contains(text(), 'Male')]")).click();
        $(By.id("userNumber")).setValue("2223334455");
//        $(By.id("dateOfBirthInput")).click();
//        $(By.xpath("//select[@class='react-datepicker__month-select']//option[contains(text(), 'May')]")).click();
//        $(By.className("react-datepicker__month-select")).click();
//        $(By.xpath("//option[contains(text(), 'May')]")).click();
//        $(By.className("react-datepicker__year-select")).click();
//        $(By.xpath("//option[contains(text(), '1999')]")).submit();
//        $(By.xpath("//div[contains(text(), '18')]")).click();
//        $(By.className("subjects-auto-complete__input")).setValue("Biology and Chemistry");
        $(By.xpath("//label[contains(text(), 'Sports')]")).click();
        $(By.id("submit")).scrollIntoView(false);
        $(By.xpath("//div[contains(text(), 'Select State')]")).click();
        $(By.xpath("//div[contains(text(), 'Uttar Pradesh')]")).click();
        $(By.xpath("//div[contains(text(), 'Select City')]")).click();
        $(By.xpath("//div[contains(text(), 'Merrut')]")).click();
        $(By.id("submit")).submit();
    }

}
