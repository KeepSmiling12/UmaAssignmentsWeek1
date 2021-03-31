package week3.day1.assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		
		// Uncheck the check box - sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// clear and type in the source station txtStationFrom
		WebElement frm = driver.findElement(By.id("txtStationFrom"));
		frm.clear();
		frm.sendKeys("Bangalore");
		frm.sendKeys(Keys.ENTER);
		
		//clear and type in the destination station
		WebElement toDest = driver.findElement(By.id("txtStationTo"));
		toDest.clear();
		toDest.sendKeys("Bangalore");
		toDest.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		//Find all the train names using xpath and store it in a list
		List<String> trnNames = new ArrayList<String>();			
		List<WebElement> namesTrns =  driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));			
		for (WebElement e : namesTrns) {
			
			String nmTrn = e.getText();
			trnNames.add(nmTrn);
			
		}		
		Collections.sort(trnNames);
		System.out.println(trnNames);		
		System.out.println(trnNames.size());
	}

}
