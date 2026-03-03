package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePageSteps {
    WebDriver driver;
    @Given("user navigates to amazon home page")
    public void homepage(){
        driver= new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googinhydr1-21&ref=pd_sl_29i26llojo_e&adgrpid=176445329508&hvpone=&hvptwo=&hvadid=714840681044&hvpos=&hvnetw=g&hvrand=5626982662392605097&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=9303682&hvlocphy=1002216&hvtargid=kwd-381707589077&hydadcr=18660_2389251&mcid=d2ba3744e6be3e1192da9e3ea1288f42&gad_source=1");

    }
    @And("User click the search button")
    public void searchbutton(){
        driver.findElement(By.xpath("//input [@id = 'nav-search-submit-button']")).click();

    }
    @When("User enter the product name {string}")
    public void enterproductname(String items){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox"))
        );

        searchBox.sendKeys(items);
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(items);

    }

    @Then("user verify the title page")
    public void ValidateTitle() {

        System.out.println(driver.getTitle());
    }

    @When("User select value from dropdown")
    public void dropdownvalues() {
        WebElement dropdownelement = driver.findElement(By.id("searchDropdownBox"));
        int dropdowncount = dropdownelement.findElements(By.tagName("option")).size();
        for(int i =0; i<dropdowncount; i++ ){

            String values = dropdownelement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(values);
        }
    }
}

