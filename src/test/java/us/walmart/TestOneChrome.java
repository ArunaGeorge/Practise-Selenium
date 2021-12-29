package us.walmart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOneChrome {
  public static void main(String[] args) throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			  WebDriver driver = new ChromeDriver(); //Creating an object of ChromeDriver
			  driver.manage().window().maximize();


			  driver.get("https://www.walmart.com/");
			  driver.findElement(By.id("global-search-input")).sendKeys("headphones"); //name locator for text box
			  WebElement searchbutton = driver.findElement(By.xpath("//img[@src=\"//i5.walmartimages.com/dfw/63fd9f59-43e0/1ed7036a-feba-43ca-8885-1d937a9aa4f2/v1/search-nav-black.b92f68559cf70c3bcfb9eae1d8dcca59ca58af11.svg\"]"));//name locator for google search
			  searchbutton.click();
			  Thread.sleep(2000);
			  driver.quit();
			  
			
  }

}
