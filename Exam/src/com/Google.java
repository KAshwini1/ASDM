package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {


	
		 
		 public static void main(String[] args) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\group030\\Desktop\\190843120015\\chromedriver_win32\\chromedriver.exe");

		       WebDriver driver = new ChromeDriver();
		  
		       driver.manage().window().maximize();
		  
		       driver.get("https://accounts.google.com/SignUp");
		  
		       driver.findElement(By.id("firstName")).sendKeys("Selenium");
		       driver.findElement(By.id("lastName")).sendKeys("group030");
		       driver.findElement(By.id("username")).sendKeys("ashwini");
		       driver.findElement(By.name("Passwd")).sendKeys("DemoPassword");
		       driver.findElement(By.name("ConfirmPasswd")).sendKeys("DemoPassword");
		       driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("8408096781");
		       driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("kadamashwini2591@gmail.com");
		       
		       
		 		 }

		}

