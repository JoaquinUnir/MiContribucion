package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetText {
    public static String getText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }
}
