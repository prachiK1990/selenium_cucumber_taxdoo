package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.landingPageTaxdoo;

public class TaxdooSteps {
	
	WebDriver driver = null;
	
	@Given("User navigates to landing page")
	public void verifyLanding() {

		System.out.println("Inside Step - verifyLanding");
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://booking.test.env.taxdoo.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  
	}
	
	@When("^User selects Average Revenue(.*) per Month$")
	public void userSelectsAverageRevernuePerMonth(String revenue) {
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.selectRevenue(revenue);
			
	}
	
	@And("^User selects Package$")
	public void userSelectsPackage() {
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.selectPackage();
		}
	@And("^User clicks Next button$")
	public void userClicksNextButton() {
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.userClicksNextButton();	
	}
	
	@And("^User enters data in the second page (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*)$")
	public void userEntersDataInSecondPage(String Company_name ,String Salutation, String First_name,String Last_name,String Address,String Vat_ID,String Email,String Telephone) {
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.userEntersDataInSecondPage(Company_name ,Salutation,First_name,Last_name,Address,Vat_ID,Email,Telephone);
	}
	
	@And("^User redirects to summary page and select complete booking$")
	public void userCompletesBookingOnSummaryPage(){
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.userCompletesBookingOnSummaryPage();	
	}
	@Then("^User redirects to Booking sucessful page and verifies that booking is successful$")
	public void userCompletesBookingSuccessfuly(){
		landingPageTaxdoo page = new landingPageTaxdoo(driver);
		page.userCompletesBookingSuccessfuly();	
	}
	
	
}
