package pages;

import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {
    public void differentClicks() {
        $("#doubleClickBtn").doubleClick();
        Assert.assertTrue("You have done a double click", true);
        $("#rightClickBtn").contextClick();
        Assert.assertTrue("You have done a double click You have done a right click", true);

//        Невозможно найти оригинальный локатор, id - плавающий.
//        $(By.xpath("//div[@class='mt-4']//button[@id='8XeaU'][contains(text(), 'Click Me')]")).click();
//        Assert.assertTrue("You have done a double click You have done a right click You have done a dynamic click", true);
    }
}
