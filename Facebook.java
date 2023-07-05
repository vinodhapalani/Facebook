package org.facebook;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {

	 public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://https://www.youtube.com/");
		  
		  
		  driver.manage().window().maximize();
		  
		  
		  
	 }
}		  
	
