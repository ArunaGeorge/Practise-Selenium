package us.walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
			System.out.println("Current Title");
		}else {
			System.out.println("Not current title");
		}
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
	

}
