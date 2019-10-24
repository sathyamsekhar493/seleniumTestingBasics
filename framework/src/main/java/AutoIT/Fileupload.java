package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//div[@class='l0v3m7-6 hIetmX']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\Fileupload123.exe");
		
	


	}

}
