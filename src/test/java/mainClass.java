import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mainClass extends BaseClass {
public static void main(String[] args) {
	launchChromeBrowser();
	loadurl("https://www.facebook.com/");
	GetTitle();
	getCurrentUrl();
	WebElement user = driver.findElement(By.id("email"));
	insert(user, "6385662367");
	WebElement pass = driver.findElement(By.id("pass"));
	insert(pass, "34567894567");
	WebElement log = driver.findElement(By.xpath("//label[@id=\"loginbutton\"]"));
	btnclick(log);
	//disAlert(e);

}


}
