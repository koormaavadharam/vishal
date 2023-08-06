package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		
	 driver.navigate().to("https://www.facebook.com/");
		
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	if (title.equals("Facebook – log in or sign up")) {
		
		System.out.println("this is a facebook login page");
		
	} else {
		
		System.out.println("this is not a facebook login page");	

	}
		
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);
	
	String pageSource = driver.getPageSource();
	
	System.out.println(pageSource);

	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	
	email.sendKeys("rahul2@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	
	  WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	  
	  pass.sendKeys("1234");
	  
	  String attribute = driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
	  
	  System.out.println(attribute);
	  
	  Thread.sleep(5000);
	  
	  
	
	
	WebElement loginbtn = driver.findElement(By.xpath("//button[contains(@type,'sub')]"));
	
	  boolean selected = loginbtn.isSelected();
		
		 if (selected==true) {
			
			System.out.println("element is selected");
			
		} 
		
		else {
			
			System.out.println("element is not selected");

		}
		
	loginbtn.click();
	
	 
		
	
	WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	
	boolean FBlogo = logo.isDisplayed();
	
	if (FBlogo==true) {
		
		System.out.println("you are in FB page");
		
	} 
	else {
		
		System.out.println("you are not in FB page");

	}
	
	boolean editable = logo.isEnabled();
	
	if (editable==true) {

		System.out.println("This is a editable webelement");
		
		
	} else {
		
		System.out.println("This is not a editable webelement");

	}
	
	WebElement findElement = driver.findElement(By.cssSelector("[type=password]"));
	
	}

}
