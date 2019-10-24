package Javapractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	
	@Test
	public static void launchapp() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("9492075604");
		driver.findElement(By.xpath("//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys("9492075604");
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element =driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
				element.clear();
				element.sendKeys("Mobiles");
				element.sendKeys(Keys.ENTER);
	    
	}

}
