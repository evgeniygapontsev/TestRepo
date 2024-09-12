package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    public void textIn(String name, String email, String address, String anotherAdr) {
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(address);
        $("#permanentAddress").setValue(anotherAdr);
        $("#submit").submit();
    }
}
