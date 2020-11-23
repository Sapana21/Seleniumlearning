package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2ta {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://c2ta.co.in/register/");
		driver.findElement(By.id("reg_username")).sendKeys("Anurag");
		driver.findElement(By.id("reg_email")).sendKeys("a.indurkhya@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("123$Xyz");
		driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
		
	}
	

}
