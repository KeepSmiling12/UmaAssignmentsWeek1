package week3.day1.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LrnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		
		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click ME!']"));		
		wait.until(ExpectedConditions.elementToBeClickable(clickMe));
		//confirm 
		System.out.println(clickMe.isDisplayed()); 
		clickMe.click();		
		Alert alrt = driver.switchTo().alert();	
		String alrtMsg = alrt.getText();
		System.out.println(alrtMsg);
		alrt.accept();		
	
	}
	
	

}
