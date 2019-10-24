package framework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class EventMethods {
	
	
		public static void DeleteFiles(String path) {
			boolean isfile = true;
			File file = new File(path);
			File[] files = file.listFiles();
			
			for (File f : files) {
				if (f.isFile() && f.exists()) {
					f.delete();
				}
			}
			if (isfile) {
				System.out.println("successfully deleted");
			} else {
				System.out.println("not deleted");
			}
		}

		public static void main(String[] args) {
			DeleteFiles("D:\\screenshots");
		}
		
		
		
		}


