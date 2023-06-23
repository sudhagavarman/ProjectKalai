package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb"));
        driver.findElement(By.xpath("//img[@class=\"gb_k gbii\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"XXOzTe\"]")).click();
        driver.findElement(By.tagName("Sign in"+Keys.ENTER));
        // driver.findElement(By.name("q")).sendKeys("kalaiyarasi"+ Keys.ENTER);
        //edriver.findElement(By.id("Google Search")).click();

    }
}
