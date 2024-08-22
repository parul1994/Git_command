package Basic_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLick_admin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(430,932));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']"));
		drop.click();
		drop.findElement(By.xpath("(//a)[17]")).click();
		//driver.findElement(By.xpath("(//a)[17]")).click();

	}

}
