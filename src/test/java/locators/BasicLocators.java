package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
    /*   boolean logoisdispalyed=driver.findElement(By.id("logo")).isDisplayed();
System.out.println(logoisdispalyed);

WebElement tablet=driver.findElement(By.linkText("Tablets"));
tablet.click();
WebElement tablets=driver.findElement(By.partialLinkText("Tabl"));
tablets.click();

     List<WebElement> headerliks=driver.findElements(By.className("list-inline-item"));
   System.out.println(" header link size:"+ headerliks.size()); 
		List<WebElement> links	=driver.findElements(By.tagName("a"));
		System.out.println(links.size()); 
		List<WebElement> images	=driver.findElements(By.tagName("img"))	;
		System.out.println(images.size());*/
}
	
}