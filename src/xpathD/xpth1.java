package xpathD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class xpth1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Classes\\xpath\\xpathD\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("findme");
		
		
	}

}
