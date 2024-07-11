package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class conditionalMethod {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement img=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	 boolean imgdis=	img.isDisplayed();
	 System.out.println(imgdis);
	 WebElement firstname=driver.findElement(By.id("FirstName"));
	boolean forstnameisena= firstname.isEnabled();
	System.out.println("forstnameisenable:"+forstnameisena);
	WebElement male=driver.findElement(By.id("gender-male"));
	WebElement female=driver.findElement(By.id("gender-female"));
	female.click();
	System.out.println("male isSelected:"+male.isSelected());
	System.out.println("female is selected:"+female.isSelected());
	}
}
