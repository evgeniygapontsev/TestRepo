package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import wrappers.InputWebTables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage {
    public void addNewRecord() {
        $("#addNewRecordButton").click();
        $("#registration-form-modal").isEnabled();
        new InputWebTables("firstName").addText("Bill");
        new InputWebTables("lastName").addText("Loop");
        new InputWebTables("userEmail").addText("bl@gmail.com");
        new InputWebTables("age").addText("25");
        new InputWebTables("salary").addText("750");
        new InputWebTables("department").addText("QA");
        $("#submit").submit();
    }

    public void isCreated() {
        $$(By.className("ReactTable")).findBy(Condition.exactText("bl@gmail.com"));
//        $$(By.className("ReactTable")).shouldHave(CollectionCondition.texts("bl@gmail.com"));
    }

    public void updateRecord() {
        $("#edit-record-4").click();
        $("#registration-form-modal").isEnabled();
        new InputWebTables("department").addText("Quality Assurance");
        $("#submit").submit();
        $$(By.className("ReactTable")).findBy(Condition.exactText("Quality Assurance"));

    }
}