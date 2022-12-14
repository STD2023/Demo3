import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class try_element {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/yesmail/Downloads/geckodriver 2");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.freecrm.com");
		
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a")).click();
		
		driver.findElement(By.cssSelector(".btn-primary.btn-xs-2")).click();
		
        String msg=driver.findElement(By.cssSelector("ui.negative.message")).getText();
		
		System.out.println(msg);
		

	}

}
