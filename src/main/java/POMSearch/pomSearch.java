package POMSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomSearch {
	public WebDriver driver = null;
	public String FirstName = "fname";
	public String LastName = "lname";
	public String QA = "//a[@name='QA']";

	public pomSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		WebElement ele = null;
		ele = driver.findElement(By.id(FirstName));
		return ele;
	}

	public WebElement getLastName() {
		WebElement ele = null;
		ele = driver.findElement(By.id(LastName));
		return ele;
	}

	public WebElement getQA() {
		WebElement ele = null;
		ele = driver.findElement(By.xpath(QA));
		return ele;
	}

	public void enterFirstName(String myData) {
		try {
getFirstName().sendKeys(myData);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void enterLastName(String myLastData) {
		try {
getLastName().sendKeys(myLastData);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void clickQA() {
		try {
getQA().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
