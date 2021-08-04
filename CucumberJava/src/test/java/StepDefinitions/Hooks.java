package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;
	@Before
	public void openbROWSER() {
		
		
		String path_project = System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", path_project+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@After
	public void closerowser() {
		driver.close();
	}
}
