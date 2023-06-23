package stepdefinitionfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BrowserBase;

import javax.swing.text.Element;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginPageSteps {


    int a;
    WebDriver driver;
    WebElement currencyElement;

    @Given("User navigates to salesforce application")
    public void navigateUrl() throws IOException {

        BrowserBase base = new BrowserBase();
        driver = base.browserBaseCode();


    }

    @When("User enters the username {string} and password {string}")
    public void enterUserNamePassword(String username, String password) {
        driver.findElement(By.id("Username")).sendKeys("Username");
        driver.findElement(By.id("Password")).sendKeys("Password");


        System.out.println(username);
        System.out.println(password);


        driver.findElement(By.linkText("Read our brochure")).click();
        driver.findElement(By.partialLinkText("bro")).click();
    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.name("Login")).click();

    }

    @Then("validate the error message")
    public void validateTheErrorMessage() {
        String actualResult = driver.findElement(By.id("error")).getText(); //string
        String expectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        if (actualResult.equals(expectedResult)) {
            System.out.println("equal");
        } else {

            System.out.println("not equal");
        }

    }


    @Given("User navigates to URL")
    public void userNavigatesToURL() throws IOException {
        BrowserBase base = new BrowserBase();
        driver = base.browserBaseCode();


    }


    @When("Iterate the static dropdown values")
    public void iterateTheStaticDropdownValues() {
        currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        List<WebElement> currency = currencyElement.findElements(By.tagName("option"));
        List<String> currencyval = new ArrayList<>();
        for (WebElement e : currency) {
            currencyval.add(e.getText());
        }
        for (String q : currencyval)
            System.out.println(q);
        System.out.println(currencyval);

        // int currencySize = currencyElement.findElements(By.tagName("option")).size();
        //for (int i=0;i<currencySize;i++)

    }
    // {

    // String value = currencyElement.findElements(By.tagName("option")).get(i).getText();
    //System.out.println(value);
    // }


    @And("Handle the static dropdown")
    public void handleTheStaticDropdown() {
        Select SelectCurrency = new Select(currencyElement);
        SelectCurrency.selectByIndex(7);
        // SelectCurrency.selectByVisibleText("EUR");
        SelectCurrency.selectByValue("USD");


        driver.findElement(By.id("divpaxinfo")).click();
        WebElement aadultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select SelectAdult = new Select(aadultElement);
        //SelectAdult.selectByValue("1");
        SelectAdult.selectByIndex(5);


        WebElement childElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
        Select SelectChild = new Select(childElement);
        SelectChild.selectByIndex(2);


        WebElement infantElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"));
        Select SelectInfant = new Select(infantElement);
        SelectInfant.selectByIndex(4);

    }


    @When("Iterate the dynamic dropdown values")
    public void iterateTheDynamicDropdownValues() {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        WebElement toElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"));
        toElement.findElement(By.xpath("//a[@value='MAA']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popUpConverter")));

        driver.findElement(By.id("popUpConverter")).click();


    }

}












