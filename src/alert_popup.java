import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/alerts/");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
    Alert alt = driver.switchTo().alert();
    alt.accept();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Confirm']")).click();
    alt.dismiss();
	}

}
