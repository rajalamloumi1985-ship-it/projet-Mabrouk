package StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;
import Pages.ProductPageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ProductPageMabroukStepDef {
	
	ProductPageMabrouk product = new ProductPageMabrouk();
	@Given("utilisateur accède à la page {string}")
    public void utilisateur_accède_à_la_page(String url) {
        Config.demarrerNavigateur();
        Config.driver.get(url);
    }

    @When("utilisateur clique sur le produit {string}")
    public void utilisateur_clique_sur_le_produit(String nomProduit) {
        product.cliquerProduit();
    }

    @Then("utilisateur se trouve sur la page du produit et la page s'affiche")
    
    public void utilisateur_se_trouve_sur_la_page_du_produit_et_la_page_s_affiche() {
        WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(20)); 
        WebElement titrePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        org.junit.Assert.assertTrue("La page du produit ne s'est pas affichée !", titrePage.isDisplayed());
    }}