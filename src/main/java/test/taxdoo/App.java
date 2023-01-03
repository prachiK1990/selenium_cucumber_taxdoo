package test.taxdoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	// TODO Auto-generated method stub
    			System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
    			WebDriver driver=new ChromeDriver();
    			driver.get("https://www.facebook.com/");
    		//	driver.navigate().to("https://engineerdiaries.com/test");
    			driver.manage().window().maximize();
//    			driver.manage().window().scrollBy(0,5000);
    			
    			driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("prachi");
    			//driver.findElement();
    			
    			driver.close();

    	
    }
}
