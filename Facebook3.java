package org.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook3 {

	  public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
		  driver.manage().window().maximize();
		 
		 WebElement button=driver.findElement(By.xpath("//a[text()= 'Create New Account']"));
		 button.click();
		 Thread.sleep(3000);
		
		 WebElement Year=driver.findElement(By.id("year"));
		 Year.click();
		  
		Select s=new Select(Year);
		s.selectByIndex(1);
		 
		List<WebElement> options=s.getOptions();
		for (int i = 0; i <options.size() ; i++) {
			
			WebElement dropdown=options.get(i);
			String text=dropdown.getText();
			System.out.println(text);  
		}
		
		 
	}
	  
}
