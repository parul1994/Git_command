package Basic_functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fb_registration {
	
	WebDriver driver;
	
  @Test
  public void test() throws InterruptedException {
	  
	  	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("parul");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gupta");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("parul123@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("parul123@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("P3455@123");
		Thread.sleep(1000);
		Select  sel= new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		sel.selectByValue("28");
		Thread.sleep(1000);
		Select  sel1= new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
		sel1.selectByVisibleText("Feb");
		Thread.sleep(1000);
		Select  sel2= new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		sel2.selectByValue("1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name=\'websubmit\']")).click();

	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  System.out.println("current url of the driver is ->"+ driver.getCurrentUrl());  
	  driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("facebook");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='btnK']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@class='l']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@class='_97w5']")).click();
	  Thread.sleep(2000);
	   
  }

  @AfterMethod
  public void afterMethod() {
	System.out.println("current url of the driver is ->"+ driver.getCurrentUrl());  
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
