package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;
import net.serenitybdd.core.Serenity;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I am on the login page")
    public void ontheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter valid username")
    public void enterValidUsername(){
        login.inputUsername("standard_user");
    }
    @And("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("secret_sauce");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }
    @Given("I am an the login page")
    public void anTheLoginPage2(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter an incorrect username")
    public void enterIncorrectUsername(){
        login.inputUsername("invalid_user");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        login.inputPassword("secret_sauce");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I will get the Epic sadface error")
    public void validateEpicSadfaceError(){
        login.validateEpicSadfaceError();
    }

    @Given("I am an the home page")
    public void anTheHomePage(){
        home.validateOnTheHomePage();
    }
    @When("I add items to cart")
    public void addItemsToCart(){
        home.addToCart();
    }
    @And("I click the cart button")
    public void clickCartButton(){
        login.clickCartButton();
    }
    @And("I click the checkout button")
    public void clickCheckoutButton(){
        login.clickCheckoutButton();
    }
    @Then("I should be directed to the checkout-complete page for confirmation")
    public void validateCheckoutCompletePage(){
        home.validateCheckoutCompletePage();
    }

    public static void takeScreenshot() {
        Serenity.takeScreenshot();
    }
}
