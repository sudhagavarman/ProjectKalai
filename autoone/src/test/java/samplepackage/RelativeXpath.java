package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.3i-infotech.com/aaa-flexib-campaign/?utm_source=google&utm_medium=text-ads&utm_campaign=AAA-F-LTA&gclid=CjwKCAjwsMGYBhAEEiwAGUXJaUukYasEahZC2LSVIlyr7IN9xnVpqrbU0NhrA9SGxX4J4FkOlyXuXxoCYCcQAvD_BwE");
        driver.findElement(By.xpath("//input[@id = 'fname']")).sendKeys("kathir");
        driver.findElement(By.xpath("//input[@name = 'lname']")).sendKeys("varman");
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys("infosys");
        driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("project leader");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sudhagavarman@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9003794317");
        driver.findElement(By.className("//input[@Class='submit']")).click();
    }
}
