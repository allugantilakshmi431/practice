package Dtepicker;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
        //  WebElement datepicker=  driver.findElement(By.id("datepicker"));
         // datepicker.sendKeys("05/22/2024");
          
    //method2
String year="2020";
String month="May";
String Date="22";

          WebElement datepicker=  driver.findElement(By.id("datepicker"));
          datepicker.click();
          while(true) {
        	  String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        	  String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        	  if(current_month.equals(month)&& current_year.equals(year))
        	  {
        		  break;
        	  }
        	//  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        	  
          	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	 }
       List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
          for(WebElement dt:dates) {
        	  if(dt.getText().equals(Date)) {
        		  dt.click();
        		  break;
        	  }
          }
          
	}

}
