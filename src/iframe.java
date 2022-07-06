import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		driver.switchTo().frame("Frame1");
		driver.findElement(By.xpath("//a[text()='Category1']")).click();
		Thread.sleep(10000);
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//a[text()='Blogger']")).click();
	    Thread.sleep(5000);
	    driver.quit();
	}

}
