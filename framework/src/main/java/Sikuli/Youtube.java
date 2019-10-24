package Sikuli;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) {
		Screen screen = new Screen();
		Pattern eclipse = new Pattern("C:\\Users\\Admin\\Pictures\\minimizEclipse.PNG");
		Pattern google= new Pattern("C:\\Users\\Admin\\Pictures\\google.PNG");
		Pattern maximize= new Pattern("C:\\Users\\Admin\\Pictures\\maximize.PNG");
		Pattern close= new Pattern("C:\\Users\\Admin\\Pictures\\close.PNG");
		try {
			screen.click(eclipse,2);
			screen.doubleClick(google,3);
			screen.click(maximize,2);
			screen.click(close,2);
			
		} catch (FindFailed e) {
			e.printStackTrace();
		}

	}

}
