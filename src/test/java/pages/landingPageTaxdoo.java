package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class landingPageTaxdoo {

	WebDriver driver;

	public landingPageTaxdoo(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void sleep (long mili)
	{
		try {
			Thread.sleep(mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectRevenue (String revenue) {

		WebElement averageRevenue = driver.findElement(By.xpath("//div[text()='Select Your Average Revenue (Per Month)']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",averageRevenue);
		sleep(2000);
		String myxpath =  "//label[@for='average-gross-" +revenue+"']";
		WebElement amountRevenue = driver.findElement(By.xpath(myxpath));
		amountRevenue.click();
		//sleep(5000);
	}

	public void selectPackage() {
		//WebElement starterpackage = driver.findElement(By.xpath("//div[text()='starter']/following-sibling::div[text()='Choose']"));
		WebElement starterpackage = driver.findElement(By.xpath("//div[text()='starter']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",starterpackage);
		sleep(2000);
		starterpackage.click();
	}

	public void userClicksNextButton() {
		WebElement nextButton = driver.findElement(By.xpath("//button[@type='submit']/span[.='Next']"));
		Actions b = new Actions(this.driver);
		b.moveToElement(nextButton);
		sleep(2000);
		b.click();
		b.build().perform();		
	}

	public void userEntersDataInSecondPage(String company_name, String salutation, String first_name, String last_name,
			String address, String vat_ID, String email, String telephone) {
		WebElement companyNamefield = driver.findElement(By.xpath("//input[@placeholder='Company including legal form *']"));
		companyNamefield.sendKeys(company_name);
		
		WebElement dropDownSalutation = driver.findElement(By.xpath("//select[@name='salutation']"));
		Actions b = new Actions(this.driver);
		b.moveToElement(dropDownSalutation);
		Select selectDropdown = new Select(dropDownSalutation);
		selectDropdown.selectByValue(salutation);
		
		WebElement firstNamefield = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstNamefield.sendKeys(first_name);
	
		WebElement lastNamefield = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastNamefield.sendKeys(last_name);
		
		WebElement addressfield = driver.findElement(By.xpath("//input[@placeholder='Address']"));
		addressfield.sendKeys(address);
		sleep(5000);
		
		WebElement addressfieldValue = driver.findElement(By.xpath("//div[@class='autoComplete-dropdown-container _addressSuggestions_16bkr_33']"));
		addressfieldValue.click();
		
		WebElement vatIDField = driver.findElement(By.xpath("//input[@placeholder='VAT identification number']"));
		b.moveToElement(vatIDField);
		vatIDField.sendKeys(vat_ID);
		
		
		WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		//b.moveToElement(vatIDField);
		emailField.sendKeys(email);
		sleep(5000);
		
		WebElement telephoneField = driver.findElement(By.xpath("//input[@placeholder='Tel']"));
		//b.moveToElement(vatIDField);
		telephoneField.sendKeys(telephone);
		
		WebElement nextButton = driver.findElement(By.xpath("//button[@type='submit']/span[.='Next']"));
		b.moveToElement(nextButton);
		b.click();
		b.build().perform();
		
		
	}

	public void userCompletesBookingOnSummaryPage() {
		WebElement acceptCheckbox = driver.findElement(By.xpath("//input[@id='accept']"));
		Actions b = new Actions(this.driver);
		b.moveToElement(acceptCheckbox);
		b.click();
		//b.build().perform();
		
		WebElement completeButton = driver.findElement(By.xpath("//button[@type='submit']/span[.='Complete booking']"));
		b.moveToElement(completeButton);
		b.click();
		b.build().perform();			
	}

	public void userCompletesBookingSuccessfuly() {
		
		sleep(10000);
		
		WebElement successMessage = driver.findElement(By.xpath("//h4[text()='Booking successful']"));
		Assert.assertTrue("Booking is unsuccessful ",successMessage.isDisplayed());
		
		driver.close();
		driver.quit();
		
	}
	

}
