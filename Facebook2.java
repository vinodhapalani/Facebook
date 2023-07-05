package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	  public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 Thread.sleep(3000);
		 
		  WebElement email=driver.findElement(By.id("email"));
		  js.executeScript("arguments[0].setAttribute('valve','vinodhapalani4@gmail.com')",email);
		  
		  WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		  js.executeScript("arguments[0].setAttribute('valve','vinodha1990')", password);
		  
		 WebElement login=driver.findElement(By.name("login"));
		 js.executeScript("arguments[0].click()'",login) ;
		
	}     
}
