package Dtepicker;
import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
static Month convertmonth(String month) {
	HashMap<String,Month>monthmap=new HashMap<String,Month>	();
	monthmap.put("January",Month.JANUARY );
	monthmap.put("February",Month.FEBRUARY );
	monthmap.put("March",Month.MARCH);
	monthmap.put("April",Month.APRIL);
	monthmap.put("May",Month.MAY);
	monthmap.put("June",Month.JUNE);
	monthmap.put("July",Month.JULY);
	monthmap.put("August",Month.AUGUST);
	monthmap.put("September",Month.SEPTEMBER);
	monthmap.put("October",Month.OCTOBER);
	monthmap.put("November",Month.NOVEMBER);
	monthmap.put("December",Month.DECEMBER);
	Month vmonth=monthmap.get(month);
	if(vmonth==null) {
		System.out.println("invalid month..");
	}
	return vmonth;
	
}
static void selectdate(WebDriver driver,String year,String month,String date) {

WebElement selyear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select yeardrp=new Select(selyear);
yeardrp.selectByVisibleText(year);

while(true)
{
	String displaymonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	
	Month exceptedmonth=convertmonth(month);
	Month currentmonth=convertmonth(displaymonth);
	int result=exceptedmonth.compareTo(currentmonth);
	if(result<0) {
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}else if(result>0) {
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}else {
		break;
	}
	
}
List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
for(WebElement dt:dates) {
	  if(dt.getText().equals(date)) {
		  dt.click();
		  break;
	  }	
	
}

}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
String year="2021";
String month="May";
String date="02";
driver.switchTo().frame("frame-one796456169");
driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

selectdate(driver,year,month,date);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
