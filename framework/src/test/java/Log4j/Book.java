package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book {
	static Logger logger = Logger.getLogger(Book.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("C:\\maven\\framework\\src\\test\\java\\Log4j\\log4j.properties");

		logger.debug("Log4j appender configuration is successful !!");
		logger.info("Launch application");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/register/");
		logger.info("Application Launched Successful");
		driver.close();
		logger.info("driver closed");

	}

}
