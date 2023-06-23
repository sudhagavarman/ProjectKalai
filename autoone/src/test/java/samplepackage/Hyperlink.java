package samplepackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.subject-7.com/unified-testing/?utm_source=selenium&utm_medium=unifiedtesting&utm_campaign=product");
        driver.findElement(By.partialLinkText("PL")).click();

    }
}
