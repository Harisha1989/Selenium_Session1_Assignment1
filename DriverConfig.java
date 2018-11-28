package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverConfig {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver IEDriver = new InternetExplorerDriver();
		System.out.println("Welcome to Internet Explorer");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver ChromeDriver = new ChromeDriver();
		System.out.println("Welcome to Google Chrome");

	}

}
