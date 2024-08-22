package Basic_functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class fb_login {
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	
	 
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("parulgup@gmail.com");
	  Thread.sleep(1000);
	  
	  WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	  pass.sendKeys("jhgjhs");
	  Thread.sleep(1000);
	  
	  WebElement btn=driver.findElement(By.xpath("//button[@name='login']"));
	  btn.click();
	  Thread.sleep(1000);
	  
	  WebElement errormsg=driver.findElement(By.xpath("//div[@class='_9kq2']"));
	 
	  System.out.println("printing error message -> "+errormsg.getText());
	
	  String msg= errormsg.getText();
	  
	  Assert.assertTrue(msg.contains("We couldn't find an account that matches what you entered, but we've found one that closely matches."), "Incorrect Account message");
	  
	 
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/"); 
	  System.out.println("Title of the page -> "+driver.getTitle());
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("quiting the driver");
	  driver.quit();
  
  }

}
