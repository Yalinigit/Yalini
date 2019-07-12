package org.test;

import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProj {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Yalini\\Yals\\driver\\chromedriver.exe");
	WebDriver driv = new ChromeDriver();
	driv.get("https://www.flipkart.com");
	driv.manage().window().maximize();
    driv.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	List<WebElement> mob = new ArrayList<>();
			mob = driv.findElements(By.className("_3wU53n"));
			for (WebElement x : mob) {
				System.out.println("123");
				System.out.println("Mobile Names");
				System.out.println("names");
				System.out.println("names of mobile");
				String text = x.getText();	
				System.out.println(text);
			}
			int s = mob.size();
			System.out.println(s);
}



}
