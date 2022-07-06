import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_Handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windows);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		driver.close();
	}

}
