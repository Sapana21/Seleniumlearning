package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        int linkcount = links.size(); 
        System.out.println(links.size());
        String current=driver.getCurrentUrl();
        System.out.println(current);
		
		
		
		
		
		
	
		
		
		
		
		   
		

	}

}
