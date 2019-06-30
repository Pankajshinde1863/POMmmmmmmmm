package seleniumjavaframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","/home/pankaj/Desktop/Pankaj/Java/seleniumjavaframework/drivers/chromedriver/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.org");
		
	}
}
