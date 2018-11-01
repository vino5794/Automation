import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatiC_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("https://www.goindigo.in");
		System.out.println(driver.getTitle());
		
		//static dropdowns -- In select Class,we need to create an object and need to pass the web element
		
		//Select df= new Select(driver.findElement(By.id("month")));
		//df.selectByValue("6");
		//	//df.selectByIndex(4);
		//df.selectByVisibleText("Jul");
		
	
	// Need to check	System.out.println(driver.findElement(By.name("birthday_month")).getText());
		
		
		
	//	driver.findElement(By.xpath("//*[@id=\'oneWay\']/form/div[1]/ul/li[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='oneWay']/form/div[1]/ul/li[1]/input[1]")).click();

	
		

		
		
		
	}

}
