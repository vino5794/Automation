import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		System.out.println(driver.getTitle());
		
		
		//check bookmrk in chrome - contains one sample website handling java alerts
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}

}
