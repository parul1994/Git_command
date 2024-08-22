package Basic_functionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra_menu {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");	
		
		//WebElement menu=driver.findElement(By.xpath("//a[@data-reactid='180']"));
		WebElement menu=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		String txt=menu.getText();
		System.out.println(txt);
		menu.click();
		
		driver.quit();
		
	}

}
