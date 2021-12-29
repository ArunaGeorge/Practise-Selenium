package us.walmart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		//This programme not runned 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		String st = alert.getText();
		if(st.equals("Please Enter Text")) {
			
			System.out.println("correct popup");
		}else {
			System.out.println("incorrect popup");
		}
			

	}

	

}
