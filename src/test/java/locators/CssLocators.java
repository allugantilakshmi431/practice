package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		 WebElement search=driver.findElement(By.cssSelector("input#small-searchterms"));
		 search.sendKeys("Books");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		
	}

}
//*[@id="customerCurrency"]