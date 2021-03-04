package com.usa.login.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLoginTest {
	static WebDriver  driver;
	// 1. How to open the browser in selenium?	
	public static void main(String[] args) {		                   
	 // System is a java final class    // Driver name  Location of driver or path
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
    // Interface  Object   Java keyword & chrome is a Class
	  driver  =  new ChromeDriver();  // Up-casting 
		
       // 2. How you enter the URL	
	   driver.get("https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fdoapp%2FSignUp%3Floc%3Den_US");
	  
		  
	// Navigate method help to go forward & backward 
	// driver.navigate().to("https://www.facebook.com/");
	// 3. What is the different between get & navigate 

	  
    // 4. How to maximize the browser
	  driver.manage().window().maximize();
	  
	  // How to find the web-element ?
	  
	  //driver.findElement(By.partialLinkText("Sign up / Log in")).click();
	 // driver.findElement(By.linkText("Sign up / Log in")).click();
	  
	  
	  driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
	  
	  
	WebElement obj =  driver.findElement(By.id("pwd"));
	obj.sendKeys("SAYEDawan2008");
	
	obj.submit();
	  
	  ///driver.findElement(By.id("submitBtn")).click();
	  
	  System.out.println(driver.getTitle());
	   
	  // How to close the browser  
	   driver.quit();
	  // driver.close();
	    
	 // 5. What is the different between close & quit
	  
	  // Ans:- Driver.quit method close the browser as well as close the server
	  // Driver.close only close the browser 
	  // Driver.close help to close the IE browser
	  
	}

}
