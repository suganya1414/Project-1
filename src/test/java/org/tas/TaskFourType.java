package org.tas;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFourType {
	static WebDriver driver;
	@BeforeClass
	public void privat() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspacesukanya\\Junit\\driver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

	}
	
	
	

}
