import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		//static dropdowns -- In select Class,we need to create an object and need to pass the web element
		
	//	driver.findElement(By.xpath("//input[@value='2']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@value='2']")).isSelected());
		
	
		//To get the number of radio buttons present in the section
		int count = driver.findElements(By.xpath("//input[@name='sex']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='sex']")).get(i).click();
	// System.out.println(driver.findElements(By.xpath("//input[@name='sex']")).get(i).getAttribute("value"));		
		//System.out.println(driver.findElements(By.xpath("//input[@name='sex']")).get(i).getAttribute("id"));	
	String st = driver.findElements(By.xpath("//input[@name='sex']")).get(i).getAttribute("value");
	
	if(st.equals("2"))
	{
		driver.findElements(By.xpath("//input[@name='sex']")).get(i).click();
		break;
	}

		}
		//	System.out.println(driver.findElements(By.xpath("//input[@name='sex']")).get(0).isSelected());

		
		
		
	}

}
