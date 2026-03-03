package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Wikisteps {
    WebDriver driver;

    @Given("User navigates to Wiki homepage")
    public void wikihome() {
        driver = new EdgeDriver();
        driver.get("https://en.wikipedia.org/wiki/Infosys");

    }

    @When("User extracts the shareholder value")

    public void userExtractsTheShareholderValue() {
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for (int k = 0; k < size; k++) {
            String Shareholdervalues = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println(Shareholdervalues);

        }
        int count = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[1]")).size();
        for (int j=0; j< count; j++){
            String firstcolumnvalues = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[1]")).get(j).getText();
System.out.println(firstcolumnvalues);
        }
    }

        @And("User Extracts the shareholding value")
        public void userExtractsTheShareholdingValue () {
       int SharholdingCount = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
for (int i = 0; i<SharholdingCount; i++ ){
String Shareholdingvalue =    driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();

System.out.println(Shareholdingvalue);
}
        }

        @Then("Validate the mapping")
        public void validateTheMapping () {
        }

}