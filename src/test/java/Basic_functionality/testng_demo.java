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

public class testng_demo {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  System.out.println("opening the facebook");
	  String expect_title="hello facebook";
	  Assert.assertEquals(driver.getTitle(),expect_title );
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("printing actual title");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Closing the browser");
	  driver.quit();
  }

}
