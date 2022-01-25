package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InputBookstore {

    private final String inputId;

    public InputBookstore(String input) {
        this.inputId = input;
    }

    public void addToForm(String text) {
        $(By.id(inputId)).setValue(text);
    }
}
