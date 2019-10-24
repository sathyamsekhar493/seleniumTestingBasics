package Javapractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takesscreenshot {
	public static void main(String[] args) {
		screenshot();
	}

	public static void screenshot() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement username = driver.findElement(By.name("username"));
		WebElement scrolling= driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		js.executeScript("arguments[0].scrollIntoView();", scrolling);
		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File dest = new File("D:\\image2.png");
		File src = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
