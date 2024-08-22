package Basic_functionality;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class web_d {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		//To check the different version of chrome.Used for compatability testing. 
		//WebDriverManager.chromedriver().driverVersion("101.23.32.1").setup();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//syntax for explicit wait
		WebDriverWait wait= new WebDriverWait(driver,  Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();		
		 
		
		

	}

}
