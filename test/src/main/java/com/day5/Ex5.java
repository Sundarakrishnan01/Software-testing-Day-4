package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins*=");
		WebDriverManager.chromedriver().setup();
		
//		driver.manage().window().maximize();
		
		String arr[]={"apple","selenium","Cucumber"};
		String wid[]=new String[3];
		String title[]=new String[3];
		
		for(int i=0;i<3;i++) {
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.google.com/?q=" + arr[i]);
			driver.manage().window().maximize();
//			WebElement e=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//			e.sendKeys(arr[i]);
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
			wid[i]=driver.getWindowHandle();
			title[i]=driver.getTitle();
			
			Thread.sleep(1000);
			driver.close();
			
		}
		for(int i=0;i<3;i++) {
			System.out.println(wid[i]);
		}
		for(int i=0;i<3;i++) {
			System.out.println(title[i]);
		}
		

	}

}
