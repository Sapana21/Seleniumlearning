package com.testcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("username")).sendKeys("Anurag");
		driver.findElement(By.id("password")).sendKeys("123$Xyz");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		driver.findElement(By.linkText("Courses")).click();
		driver.findElement(By.linkText("Practice")).click();
		//driver.findElement(By.xpath("//*[@id=\"learn-press-course\"]/div/div[4]/form/button")).click();
		driver.findElement(By.linkText("Input Type Learning")).click();
		driver.findElement(By.xpath("//*[@id=\"learn-press-content-item\"]/div[2]/div[1]/div/div[1]/div/fieldset/p/label[1]/input")).click();
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File(("src/test/resources/Screeshot/c2ta.png")));
	         
		
	}

}
