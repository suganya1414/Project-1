import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	static Select s;
    static Actions acc;
	static Alert a;
	public static void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspacesukanya\\Junit\\driver\\chromedriver.exe");
        driver= new ChromeDriver();	}
public static void loadurl(String Url) {
    driver.get(Url);
}
public static void GetTitle() {
String t = driver.getTitle();
System.out.println(t);
}
public static void getCurrentUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}
public static void insert(WebElement e, String Value) {
e.sendKeys(Value);
}
public static void btnclick(WebElement e) {
e.click();
}
public static void mouseOver(WebElement e) {
acc=new Actions(driver);
acc.moveToElement(e).perform();
}
public static void dAD(WebElement e,WebElement e1) {
acc.dragAndDrop(e, e1).perform();
}
public static void rightClick(WebElement e) {
acc.contextClick(e).perform();
}
public static void dclick(WebElement e) {
acc.doubleClick(e).perform();
}
public static void disAlert(WebElement e) {
a= driver.switchTo().alert();
a.dismiss();
}
public static void accAlert() {
a.accept();
}

}














