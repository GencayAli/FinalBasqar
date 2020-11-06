package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class _Parent {

    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    //TODO bu kisimdaki metodu ihtiyac olmasi halinde kullancagiz add edit butunlarda hata cikarsa
//    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
//        wait.until(ExpectedConditions.invisibilityOfAllElements(elementList));
//
//        return elementList;
//    }


    public void verifyElementContainsText(WebElement element, String expectedText) {
         waitUntilVisible(element);
        //wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
        String actualText = element.getText();
        System.out.println(actualText);
        System.out.println(expectedText);

        Assert.assertTrue(element.getText().toLowerCase().contains(expectedText.toLowerCase()));
    }
}
