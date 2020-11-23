package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("username")).sendKeys("Anurag");
		//driver.findElement(By.id("password")).sendKeys("123$Xyz");
		//driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div[2]/form/p[1]/label/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div[2]/form/p[2]/button")).click();
		driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		
		
		

	}

}
