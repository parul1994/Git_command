package Basic_functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
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
public class googleTestScript {
  WebDriver driver;
	@Test
  public void f() {
		WebElement text=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
		text.sendKeys("cheese");
		text.submit();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   System.out.println("title of the page "+ driver.getTitle());
	   
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("quiting the browser");
	  driver.quit();
  }

}
