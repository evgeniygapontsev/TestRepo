package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage {
     public void radioCheckbox() {
         $(By.xpath("//label[contains(text(), 'Yes')]")).click();
         Assert.assertTrue("You have selected Yes", true);
         $(By.xpath("//label[contains(text(), 'Impressive')]")).click();
         Assert.assertTrue("You have selected Impressive", true);
     }
}
