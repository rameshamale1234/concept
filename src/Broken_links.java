import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/");
		List<WebElement> links = driver.findElements(By.linkText("a"));
		int a=links.size();
		System.out.println(a);
		for(WebElement link:links) {
			String url = link.getAttribute("href");
			if(url==null||url.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			else {
				URL element=new URL(url);
				URLConnection httcon =(URLConnection) element.openConnection();
				httcon.connect();
				if(httcon.getReadTimeout()<400) {
					System.out.println("link is invalid");
				}
			}	}
	}
}
