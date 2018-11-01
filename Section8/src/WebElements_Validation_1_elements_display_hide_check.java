import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements_Validation_1_elements_display_hide_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("http://www.makemytrip.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("ch_login_icon")).click();
		System.out.println("Before");
		System.out.println(driver.findElement(By.id("ch_login_email")).isDisplayed());
		driver.findElement(By.id("header_tab_flights")).click();
		System.out.println("After");
		System.out.println(driver.findElement(By.id("ch_login_email")).isDisplayed());
		
		
		
	}

}
