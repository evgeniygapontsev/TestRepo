package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import wrappers.InputWebTables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage {
    public WebTablesPage addNewRecord() {
        $("#addNewRecordButton").click();
        $("#registration-form-modal").isEnabled();
        new InputWebTables("firstName").addText("Bill");
        new InputWebTables("lastName").addText("Loop");
        new InputWebTables("userEmail").addText("bl@gmail.com");
        new InputWebTables("age").addText("25");
        new InputWebTables("salary").addText("750");
        new InputWebTables("department").addText("QA");
        $("#submit").submit();
        return this;
    }

    public WebTablesPage isCreated() {
        $$(By.className("ReactTable")).findBy(Condition.exactText("bl@gmail.com"));
//        $$(By.className("ReactTable")).shouldHave(CollectionCondition.texts("bl@gmail.com"));
        return this;
    }

    public WebTablesPage updateRecord() {
        $("#edit-record-4").click();
        $("#registration-form-modal").isEnabled();
        new InputWebTables("department").addText("Quality Assurance");
        $("#submit").submit();
        $$(By.className("ReactTable")).findBy(Condition.exactText("Quality Assurance"));
        return this;
    }

    public WebTablesPage deleteRecord() {
        $("#delete-record-4").click();
        $$(By.className("ReactTable")).findBy(Condition.exactText("Quality Assurance"));
        return this;
    }
}