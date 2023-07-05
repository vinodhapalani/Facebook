package org.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook1 {

	 public static void main(String[] args) throws AWTException {
			
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://en-gb.facebook.com/");
		  driver.manage().window().maximize();
		  
		  WebElement Email=driver.findElement(By.id("email"));
		   Email.sendKeys("VinodhaPalanippan");
		  
		   WebElement password=driver.findElement(By.id("pass"));
		   password.sendKeys("vinodha19990");
		   
		   Robot r= new Robot();
		   
		   Actions a= new Actions(driver);
		   a.doubleClick(Email).perform();
		   
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_X);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_X);
		  
		 
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_V);
	 }
}	   
		   
		 
     

