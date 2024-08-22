package Basic_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin_fill_details {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("parul gupta");

	}

}
