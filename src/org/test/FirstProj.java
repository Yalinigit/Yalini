package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProj {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Yalini\\Yals\\driver\\chromedriver.exe");
	WebDriver driv = new ChromeDriver();
	driv.get("https://www.flipkart.com");
	driv.manage().window().maximize();
	driv.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
	Thread.sleep(2000);
	
}
}
