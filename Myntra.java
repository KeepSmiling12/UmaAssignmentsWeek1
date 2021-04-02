package week3.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		
		//2) Mouse over on WOMEN 
		Actions actions = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("(//a[text ()='Women'])[1]"));
		actions.moveToElement(women).perform();
			
		//3) Click Jackets & Coats //a[@href = '/women-jackets-coats']
		driver.findElement(By.xpath("//a[@href = '/women-jackets-coats']")).click();
		
		//4) Find the total count of item //span[@class = 'title-count']
		String strCt = driver.findElement(By.xpath("//span[@class = 'title-count']")).getText();	
		System.out.println(strCt);
		String strNum = strCt.replaceAll("[^0-9]", "");
		System.out.println(strNum);	
		int itemCnt = Integer.parseInt(strNum);
				
		//5)  get count of jackets from categories 
		String jackts = driver.findElement(By.xpath("(//span[@class = 'categories-num'])[1]")).getText();;
		System.out.println(jackts);
		String numJckt = jackts.replaceAll("[^0-9]", "");
		System.out.println(numJckt);
		int jcktCnt = Integer.parseInt(numJckt);
		
		//  get count coats from categories
		String strCoat = driver.findElement(By.xpath("(//span[@class = 'categories-num'])[2]")).getText();
		System.out.println(strCoat);
		String numCt = strCoat.replaceAll("[^0-9]", "");
		System.out.println(numCt);
		int coatCnt = Integer.parseInt(numCt);
		
		// Validate the sum of categories	
		if (itemCnt == jcktCnt+coatCnt) {
			System.out.println(" Yahoo count match");
		} else {
			System.out.println(" count doesn't match");
		}
				
		//6) Check Coats  common-checkboxIndicator
		driver.findElement(By.xpath("(//div[@class = 'common-checkboxIndicator'])[2]")).click();
		
		//7) Click + More option under BRAND
		driver.findElement(By.className("brand-more")).click();
				
		//8)send keys Mango, check the Mango option	
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("MANGO");		
		driver.findElement(By.xpath("(//label[text()='MANGO'])[2]")).click();
				
		//9) Close the pop-up x  //div[@class='FilterDirectory-titleBar']/child::span
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//span")).click();
		
		//10) Confirm all the Coats are of brand MANGO
		// title-count
		WebElement titleCnt = driver.findElement(By.className("title-count"));
		titleCnt.getText();
		
		// Confirm all the Coats are of brand MANGO  //h3[@class='product-brand']
		List<String> brndMngo = new ArrayList<String>();
		List<WebElement> srcMngo = driver.findElements(By.xpath("//h3[text() = 'MANGO']"));
		
		for (WebElement eachbrndMngo : srcMngo) {
			String nmMngo = eachbrndMngo.getText();
			brndMngo.add(nmMngo);
		}
		
		if (brndMngo.contains("MANGO")) {
			System.out.println("The list has only Mango Brand");
		} else {
			System.out.println("The list has a misMatch");
		}
		
		//11) mouse over Sort by //h3[@class = 'product-brand']
		WebElement sort = driver.findElement(By.xpath("//span[text()='Recommended']"));
		//actions.moveToElement(sort).perform();
		sort.click();
	
		// select Better discount //div[@class='sort-sortBy']//span[1]
		 driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		 Thread.sleep(2000);
		 
		//12) Find the price of first displayed item (//span[@class='product-discountedPrice'])[1]
		String priceFstMngo = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();		
		System.out.println(priceFstMngo);
		
		//13) Mouse over on size of the first item 
		WebElement size = driver.findElement(By.xpath("(//h4[@class='product-product']/following-sibling::h4)[1]"));
		
		actions.moveToElement(size).perform();
	
		//14) Click on WishList Now  //span[text()='wishlist']
		
		driver.findElement(By.xpath("//div[@id='desktopSearchResults']/div[2]/section[1]/ul[1]/li[1]/div[3]/span[1]/span[1]")).click();
		
		driver.close();
		
	}	
		

}
