package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {
	@FindBy(xpath = "/html/body/div[5]/div[3]/div[2]/div/main/div[1]/div[1]/div[3]/div[2]/div/div[2]/div/form/div/div[4]/div[2]")
    public WebElement titrePanier;

    public AjoutPanier() {
        PageFactory.initElements(Config.driver, this);
    }

    public boolean verifierProduitAjouter() {
        return titrePanier.isDisplayed();
    }
}

