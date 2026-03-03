package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Salesforce {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
driver.get("https://login.salesforce.com/?locale=ca");
driver.findElement(By.id("username")).sendKeys("2345678");
driver.findElement(By.name("pw")).sendKeys("123457");

driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
String errormessge = driver.findElement(By.xpath("//div[@id='error']")).getText();

        System.out.println(errormessge);

    }

}
