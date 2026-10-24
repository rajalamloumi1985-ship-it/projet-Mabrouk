package Pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;
import Helper.Utils;

public class HomePageMabrouk {
	
    @FindBy(xpath = "//a[contains(., 'Femme') or contains(text(), 'Femme')]")
    public WebElement menuFemme;

    @FindBy(xpath = "/html/body/div[5]/header/div/div/div[2]/nav/div/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a")
    public WebElement subMenuChemises;
    {
    try {
        WebDriver driver = Config.driver;
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[15]/div/div[2]/div/div/div/div/div/button/svg/path")));
        closeButton.click();
    } catch (Exception e) {
        
        System.out.println("Pop-up non trouvée ou déjà fermée.");
    }
    }

    public HomePageMabrouk() {
        PageFactory.initElements(Config.driver, this);
    }

    public void survolerMenuFemme() {
        WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(menuFemme));

        Actions actions = new Actions(Config.driver);
        actions.moveToElement(menuFemme).perform();
    }

    public void cliquerSubMenuChemises() {
        WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(subMenuChemises));
        subMenuChemises.click();
    }

	public void clickOnMenu(String menuFemme2, String menuFemme3) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	