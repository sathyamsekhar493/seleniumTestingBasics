package framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	@Test
	public static void launchapplkication() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("C:\\maven\\framework\\src\\test\\java\\framework\\mounika.html");
		ExtentReports  reports = new ExtentReports();
		      reports.attachReporter(htmlreport);
				 ExtentTest logger=reports.createTest("googletest");
				 
			if(driver.getTitle().contains("google")) 
			{
				   logger.log(Status.INFO,"this method is pass bcz of google contains");
				   logger.log(Status.PASS, "pass");

			}else {
				logger.log(Status.INFO, "this method isn fail");
				logger.log(Status.FAIL, "fail");
			}
			reports.flush();
			
			 ExtentTest logger1=reports.createTest("facebook");

			if(driver.getTitle().equals("facebook"))
			{
				logger1.log(Status.INFO, "this method is equal to google");
				logger1.log(Status.PASS, "pass");
			}else {
				logger1.log(Status.INFO, "this method isnot equal to google");
				logger1.log(Status.FAIL, "fail");
	
			}
			reports.flush();
			
			 ExtentTest logger2=reports.createTest("facebook");

				if(driver.getTitle().equalsIgnoreCase("google"))
				{
					logger2.log(Status.INFO, "this method is equal to google");
					logger2.log(Status.PASS, "pass");
					try {
						driver.findElement(By.id(""));
						
					}catch(Exception e) {
						logger2.log(Status.ERROR, e.getMessage());
						try {
							logger2.addScreenCaptureFromPath("C:\\maven\\framework\\src\\test\\java\\framework\\mounika.png");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				
				}
				else {
					logger2.log(Status.INFO, "this method is  not equal to google");
					logger2.log(Status.FAIL, "fail");
				}
				
		reports.flush();	
	}

}
