package org.tcs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTask {
	static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspacesukanya\\Junit\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/account/login");
	}
	
   @Test
   public void tc1() {
	   WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   user.sendKeys("suganyaboopathi146@outlook.com");
}
   @Test
   public void tc2() {
	   
	   WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	   pass.sendKeys("sairam");
}
   @Test
   public void tc3() {
	   WebElement btn = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]"));
	   btn.click();
	   String t = driver.getTitle();
	   System.out.println(t);
	  
}
   @After
   public void end() {
	   Date d = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yy");
		String date = sim.format(d);
		System.out.println("EndTime :"+ date);
}
   @Before
	public void start() {
		Date d = new Date();
       System.out.println("StartTime:"+d);
	}

   @AfterClass
   public static void quit() {
        driver.quit();//
}

}