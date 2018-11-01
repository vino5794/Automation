import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("https://www.goibibo.com");
		System.out.println(driver.getTitle());
		
		//static dropdowns -- In select Class,we need to create an object and need to pass the web element
		
		driver.findElement(By.id("student_fare_check")).click();
		System.out.println(driver.findElement(By.id("student_fare_check")).isSelected());
		System.out.println(driver.findElement(By.id("registerFareAlert")).isSelected());
		
	
		

		
		
		
	}

}
