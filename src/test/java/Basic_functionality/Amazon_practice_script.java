package Basic_functionality;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Set;
public class Amazon_practice_script {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement signin=driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']"));
		signin.click();
		WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("parul.ridhima@gmail.com");
		user.click();
		WebElement sub=driver.findElement(By.xpath("//input[@type='submit']"));
		sub.click();
		WebElement pass=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Parul@123");
		pass.click();
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		
		submit.click();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("laptop");
		search.click();
		WebElement submit1=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		submit1.click();
		WebElement laptop=driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		
		laptop.click();
		
	/*Set<String> s=driver.getWindowHandles();
		ArrayList arr=new ArrayList(s);
		driver.switchTo().window((String)arr.get(1));
		WebElement qty=driver.findElement(By.xpath("//select[@id='quantity']"));
		Select sel=new Select(qty);
		sel.selectByIndex(2);
		sel.selectByValue("2");
		sel.selectByVisibleText("2");
	*/
	}

}
