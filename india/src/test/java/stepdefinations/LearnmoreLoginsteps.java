package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnmoreLoginsteps {
    WebDriver driver;
    @Given("User navigates to Learnmore login Page")
    public void LearnmoreLoginPage(){
driver = new ChromeDriver();
driver.get("https://learnmore.com/login/");
    }
    @And("User click the Login button of learnmore")
    public void loginbuttonlearnmore (){
driver.findElement(By.className("wl-form__button button--primary")).click();
    }
    @Then("User navigates to homepage of Learnmore application")
    public void vaidationhomepage(){
System.out.println(driver.getTitle());
   }
    @When("User enter email {string} and password {string}")
    public void EnterEmailAndPassword(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("User validates the error message")
        public void Errormessagelearnmore(){
            System.out.println(driver.findElement(By.xpath("//div [@class='tzMarkdown form-message form-message--error']")).getText());

    }
}