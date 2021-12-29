package us.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("arunageorge641@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hyderabad6");
		driver.findElement(By.name("login")).click();		
		
	}

}
