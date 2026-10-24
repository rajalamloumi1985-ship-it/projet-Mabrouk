package Helper;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	    public static WebDriver driver; 

	    public static void demarrerNavigateur() {
	        EdgeOptions options = new EdgeOptions();
	        options.setPageLoadStrategy(PageLoadStrategy.NONE); 
	        driver = new EdgeDriver(options);
	        driver.manage().window().maximize();
	    }
	
	public static void arreterNavigateur() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void attente(int i) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
    }

    public static void waitForVisibility(WebElement submenu) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(submenu));
    }

    public static void hoverOverElement(WebElement menus) {
        Actions actions = new Actions(driver);
        actions.moveToElement(menus).perform();
    }

    public static void maximize() {
        if (driver != null) {
            driver.manage().window().maximize();
        }
    }

	public static void demarrerNavigateur1() {
		// TODO Auto-generated method stub
		
	}
	public static void demarrerNavigateur11() {
		// TODO Auto-generated method stub
		
	}



	
}

	
	

	
	
	

	
	



