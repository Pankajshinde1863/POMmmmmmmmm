package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestGoogleSearch {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("chernobyl");
		GoogleSearchPage.btnlogin(driver).click();
		
	}
}
