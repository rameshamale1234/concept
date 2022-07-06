import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qavalidation.com/demo/");
		List<WebElement> check = driver.findElements(By.xpath("//input[@name='language']"));
		for(int i=0;i<=check.size()-1;i++) {
			check.get(i).click();
			Thread.sleep(2000);
		}
	}

}
