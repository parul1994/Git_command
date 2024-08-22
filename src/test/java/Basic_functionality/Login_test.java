package Basic_functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Login_test {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(430,932));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//String text="Logout";
		WebElement  drop=driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']"));
		drop.click();
		drop.findElement(By.xpath("(//a)[17]")).click();
		/*List<WebElement> options = drop.findElements(By.tagName("li"));
		for (WebElement option : options)
		{
		    if (option.getText().equals(text))
		    {
		        option.click(); // click the desired option
		        break;
		    }
		}*/ 
		//drop.findElement(By.xpath("li[value=\" + value + \"]")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		//driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("(//a)[17]")).click();

	}

}
