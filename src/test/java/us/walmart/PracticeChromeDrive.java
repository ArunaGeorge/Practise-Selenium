package us.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChromeDrive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dillards.com");
		driver.manage().window().maximize();
		//id Locator
		driver.findElement(By.id("topcat_Beauty")).click();
		driver.findElement(By.id("topcat_Accessories")).click();
		//driver.findElement(By.id("topcat_Women")).click();
		driver.findElement(By.id("topcat_Juniors")).click();
			
		driver.findElement(By.id("topcat_Kids")).click();
		driver.findElement(By.id("topcat_Shoes")).click();
		driver.findElement(By.id("topcat_Handbags")).click();
		driver.findElement(By.id("topcat_Men")).click();
		
	

	}

}
