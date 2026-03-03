package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceSteps {
    WebDriver driver;
    @Given("User navigates to salesforce login page")
    public void salesforcelogin(){
        driver = new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=ca");
    }

    @When("User enters the username{string} and Password{string}")
    public void UsernameAndPassword(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("User click the login button")
    public void Homepage() {
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    @Then("User navigates to homepage of salesforce application")
    public void ValidateTitle() {
System.out.println(driver.getTitle());
    }

    @Then("User validates the errormessage")
    public void errormessage() {

        System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
    }
}
