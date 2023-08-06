package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
		
	
	
	WebElement findElement = driver.findElement(By.linkText("Forgotten password?"));
	
	
	
	}
	
}
