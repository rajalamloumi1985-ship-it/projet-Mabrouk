package Helper;


	import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Properties;

	public class Utils{
		
		public static String getProperty (String property) throws Exception {
			FileInputStream input= new FileInputStream ("src\\test\\resources\\properties\\propert");
			Properties properties= new Properties();
			properties.load(input);
			return(properties.getProperty(property));	
		}
			public static void hoverOverElement(WebElement menus) {
				Actions actions =new Actions(Config.driver);
				actions.moveToElement( menus).perform();
			}

		public static WebElement waitForVisibility(WebDriver driver, By locator, int timeoutInSecond) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSecond));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

		public void waitForVisibility(WebElement submenus) {
			// TODO Auto-generated method stub
			
		}
		
	}

	
	

