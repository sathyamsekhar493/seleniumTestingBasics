package Javapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class xml2 {
	@Test
	public static void getMethod() {
		Xml.LoadRepository("C:\\maven\\framework\\Repository\\repository1.xml");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/register/");
		Select edition = new Select (driver.findElement(Xml.getBy("Edition")));
		       edition.selectByVisibleText("Free Edition");
		       driver.findElement(Xml.getBy("Firstname")).sendKeys("sabhavath");
		       driver.findElement(Xml.getBy("Email")).sendKeys("mounikasabavath08@gmail.com");
		       driver.findElement(Xml.getBy("conformemail")).sendKeys("mounikasabavath08@gmail.com");
		       driver.findElement(Xml.getBy("username")).sendKeys("8555968846");
		       driver.findElement(Xml.getBy("password")).sendKeys("abcxyz@1323");
		       driver.findElement(Xml.getBy("confirmpassword")).sendKeys("abcxyz@1323");
		       driver.findElement(Xml.getBy("terms")).click();
		       driver.findElement(Xml.getBy("Submit")).click();

		       
		       
		       
		
		
		
		
	}

}
