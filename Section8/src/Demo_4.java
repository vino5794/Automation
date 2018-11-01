import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;;

public class Demo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		
		//static dropdowns -- In select Class,we need to create an object and need to pass the web element
		
		Select df= new Select(driver.findElement(By.id("month")));
		//df.selectByValue("6");
		//	//df.selectByIndex(4);
		df.selectByVisibleText("Jul");
		System.out.println(driver.findElement(By.name("birthday_month")).getText());

	
		

		
		
		
	}

}
