package starter.login;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By title(){
        return By.className("title");
    }
    public void validateOnTheHomePage(){
        $(title()).isDisplayed();
    }
    public void addToCart(){
        $(title()).isDisplayed();
    }
    public void validateCheckoutCompletePage(){
        $(title()).isDisplayed();
    }
    public static void takeScreenshot() {
        Serenity.takeScreenshot();
    }
}
