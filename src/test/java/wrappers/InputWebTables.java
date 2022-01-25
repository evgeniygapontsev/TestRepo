package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InputWebTables {

    private final String inputId;

    public InputWebTables(String input) {
        this.inputId = input;
    }
     public void addText(String text) {
        $(By.id(inputId)).clear();
        $(By.id(inputId)).setValue(text);
     }
}
