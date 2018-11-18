package testForCoat;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FileRead.ReadProperty;

public class BaseTest {
	WebDriver dr;

	public void openBrowser() throws IOException {
		Properties p = ReadProperty.fileRead("/Users/anamulhoque/eclipse-workspace/WalmartMavenCucumberProject/FeatureFile/config.properties");
		String b = p.getProperty("browser");
		String r = p.getProperty("runmode");
		if (b.equals("chrome")) {
			if (r.equals("local")) {
				System.setProperty("webdriver.chrome.driver", "/Users/anamulhoque/Downloads/chromedriver");
				dr = new ChromeDriver();
				dr.get("https://www.walmart.com/");

			}
		}

	}

	public void openHomePage() throws IOException {
		Properties p = ReadProperty.fileRead("/Users/anamulhoque/eclipse-workspace/WalmartMavenCucumberProject/FeatureFile/config.properties");
		p.getProperty("url");
	}
}
