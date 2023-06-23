package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.campuslife.co.in/contact.php");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[1]/input"));
        driver.findElement(By.name("uname")).sendKeys("kalai");
        driver.findElement(By.name("subject")).sendKeys("javaclass");
        driver.findElement(By.name("email")).sendKeys("sudhagavarman@gmail.com");
        driver.findElement(By.name("country")).sendKeys("india");
        driver.findElement(By.name("msg")).sendKeys("i am interested in java class");
        driver.findElement(By.id("SEND")).click();
    }
}
