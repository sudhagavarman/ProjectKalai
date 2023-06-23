package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resuable.BrowserBase;

import java.io.IOException;
import java.security.Key;


public class LoginSteps {

    WebDriver driver;
    WebElement toElement;


    @When("Handle the Dynamic page")
    public void handleTheDynamicPage() {
        driver.findElement(By.id("FromSector_show")).click();
        driver.findElement(By.id("spn12")).click();
        WebElement toElement= driver.findElement(By.id("ptt"));
       toElement .findElement(By.xpath("//Li[@ onchange='ChangeCabin']")).click();

    }

    @Given("User navigates to URL page")
    public void userNavigatesToURLPage() throws IOException {
        BrowserBase base = new BrowserBase();
        driver = base.browserBaseCode();
    }
}
