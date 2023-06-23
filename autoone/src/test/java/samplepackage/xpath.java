package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parcelsapp.com/en/carriers/ekart");
        driver.findElement(By.xpath("//input[@style='display: block;-webkit-user-select: none;margin: auto;cursor: zoom-out;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']")).click();
        driver.findElement(By.xpath("//input[@style='display: block;-webkit-user-select: none;margin: auto;cursor: zoom-in;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']")).click();
        driver.findElement(By.xpath("//input[@Class='media-viewer-image css-1d8vivi']")).click();
        driver.findElement(By.xpath("//input[@style='display: block;-webkit-user-select: none;margin: auto;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']")).click();
        driver.findElement(By.xpath("//input[@syle='display: block;-webkit-user-select: none;margin: auto;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']")).click();

    }
}
