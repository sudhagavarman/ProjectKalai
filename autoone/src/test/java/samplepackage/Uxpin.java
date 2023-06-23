package samplepackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uxpin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.uxpin.com/sign-up");
        driver.findElement(By.id("email")).sendKeys("sudhagavarman@gmail.com");
        driver.findElement(By.name("firstname")).sendKeys("kalai");
        driver.findElement(By.name("occupation")).sendKeys("i work for company");
        driver.findElement(By.name("password")).sendKeys("abcdef");
        driver.findElement(By.name("submit")).click();
    }
}
