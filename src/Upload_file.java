import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Upload_file {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/signup/");
		driver.findElement(By.xpath("//input[@name='datafile']")).sendKeys("E:\\TCS\\Mannul Testing\\openCart -FRS.pdf");
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select sel=new Select(gender);
		List<WebElement> options = sel.getOptions();
		 boolean result = sel.isMultiple();
		 System.out.println(result);
		for(int i=0;i<=options.size()-1;i++)
		{
			System.out.println(options.get(i));;
		}
		sel.selectByValue("female");
	}

}
