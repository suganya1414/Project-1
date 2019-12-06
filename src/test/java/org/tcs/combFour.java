package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class combFour {
	static WebDriver driver;
	@BeforeClass
public static void launch() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspacesukanya\\Junit\\driver\\chromedriver.exe");
 driver = new ChromeDriver();	
 driver.get("https://www.facebook.com/");	
}
	@Before
public  void Start() {
 System.out.println("startTime");
	}
@Test
public  void tc1() {
 System.out.println("test 1");
}
@After
public  void end() {
 System.out.println("end Time");
}
@AfterClass
public static void quit() {
 quit();
}
}

