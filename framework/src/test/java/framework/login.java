package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
	public static void login() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
