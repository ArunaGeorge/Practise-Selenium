package us.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsNaveen {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	//	1 Xpath Locator
	//	driver.findElement(By.xpath(null)).sendKeys("aruna");
		
		// 2 id Locator
		driver.findElement(By.id("yDmH0d")).sendKeys("arunageorge641@gmail.com");
		driver.findElement(By.name("v67aGc")).click();
		
	}

}
