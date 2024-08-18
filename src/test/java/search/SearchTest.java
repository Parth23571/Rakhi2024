package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMSearch.pomSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	public WebDriver driver = null;

	@BeforeTest
	public void myUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try {
			driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// 17:15 pm
	@Test
	public void f() {
		driver.manage().window().maximize();
pomSearch ss = new pomSearch(driver);
ss.enterFirstName("hello");
	ss.enterLastName("Sat\'s");
	ss.clickQA();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
