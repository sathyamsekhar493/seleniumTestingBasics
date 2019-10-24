package Javapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml {
	static DocumentBuilderFactory dbf;
	static DocumentBuilder db;
	static Document doc;

	public static void LoadRepository(String path) {

		try {
			FileInputStream file = new FileInputStream(path);
			dbf = DocumentBuilderFactory.newInstance();
			db = dbf.newDocumentBuilder();
			doc = db.parse(file);

		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String[] getObject(String element) {
		String[] obj = new String[2];
		NodeList elem = doc.getElementsByTagName(element);
		Element ele = (Element) elem.item(0);
		if (ele.hasAttribute("locator") && ele.hasAttribute("value")) {
			obj[0] = ele.getAttribute("locator");
			obj[1] = ele.getAttribute("value");
		} else {
			System.out.println("unble to find the element atributes");
		}

		return obj;

	}

	public static By getBy(String element) {
		By b = null;
		String[] objinfo = getObject(element);

		switch (objinfo[0]) {
		case "id":
			b = By.id(objinfo[1]);
			break;
		case "tagname":
			b = By.tagName(objinfo[1]);
			break;

		case "class":
			b = By.className(objinfo[1]);
			break;
		case "xpath":
			b = By.xpath(objinfo[1]);
			break;
		case "cssSelector":
			b = By.cssSelector(objinfo[1]);
			break;
		case "linktext":
			b = By.linkText(objinfo[1]);
			break;
		case "partialinktext":
			b = By.partialLinkText(objinfo[1]);
			break;
		default:
			System.out.println("unable to find the loactor");
			break;
		}
		return b;
	}

	@Test
	public static void xmlRepository() {
		LoadRepository(System.getProperty("user.dir") + "//Repository//repository.xml");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/register/");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("mouni");
		//driver.findElement(getBy("username")).clear();
		//driver.findElement(getBy("password")).clear();
		//driver.findElement(getBy("username")).sendKeys("Anilsatharla");
		//driver.findElement(getBy("password")).sendKeys("Anil1234");
		driver.findElement(getBy("login")).click();

	}

}
