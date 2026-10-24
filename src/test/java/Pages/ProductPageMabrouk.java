package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ProductPageMabrouk {
	
	@FindBy(xpath = "//a[contains(text(),'COL CLASSIQUE ET COUPE AMPLE')]")
	public WebElement produitChemise;
	
	@FindBy(xpath = "//*[normalize-space(text())='S' or @data-value='S' or contains(@class, 'swatch') and contains(text(), 'S')]")
	public WebElement tailleProduit;

	@FindBy(xpath = "//button[contains(@class, 'single_add_to_cart_button') or contains(text(), 'Ajouter au panier')]")
    public WebElement btnAjouterAuPanier;
   
    public ProductPageMabrouk() {
        PageFactory.initElements(Config.driver, this);
    }

    public void cliquerProduit() {
        WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(20));
        
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//*[contains(translate(text(), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'), 'COL CLASSIQUE')]")
        ));

        JavascriptExecutor js = (JavascriptExecutor) Config.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    public void selectionnerTailleEtAjouter() {
        WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) Config.driver;

        try {
            
            WebElement optionCouleur = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[contains(@class, 'swatch-color') or contains(@class, 'variable-item-color') or contains(@class, 'color')]")
            ));
            js.executeScript("arguments[0].click();", optionCouleur);
            Thread.sleep(1000);

            WebElement optionTaille = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[normalize-space(text() )='S' or contains(@data-value, 'S')]")
            ));
            js.executeScript("arguments[0].click();", optionTaille);
            Thread.sleep(1000);

        
            WebElement btnPanier = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(@class, 'single_add_to_cart_button') or contains(text(), 'Ajouter au panier') or @type='submit']")
            ));
            js.executeScript("arguments[0].click();", btnPanier);

            wait.until(ExpectedConditions.or(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, 'cart-count') and not(text()='0')]")),
                ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'ajouté au panier')]"))
            ));

        } catch (Exception e) {
            System.out.println("Erreur lors de l'ajout au panier : " + e.getMessage());
        }
    }
}