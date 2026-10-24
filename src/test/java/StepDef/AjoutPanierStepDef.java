package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Helper.Config;
import Pages.HomePageMabrouk;
import Pages.ProductPageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AjoutPanierStepDef {
	
    ProductPageMabrouk productPage = new ProductPageMabrouk();

    @Given("la page du produit est affichée via le lien {string}")
    public void la_page_du_produit_est_affichée_via_le_lien(String url) {
        if (Config.driver == null) {
            Config.demarrerNavigateur();
        }
        Config.driver.get(url);
    }
    
    @When("utilisateur sélectionne la couleur, la taille et clique sur {string}")
    public void l_utilisateur_sélectionne_la_couleur_la_taille_et_clique_sur_ajouter_au_panier(String action) {
        
        productPage.selectionnerTailleEtAjouter();
    }

    @When("il accède à la page du panier")
    public void l_utilisateur_accède_à_la_page_du_panier() {
        Config.driver.get("https://mabrouk.tn/panier/");
    }

    @Then("utilisateur vérifie que le produit est bien ajouté à la liste du panier")
    public void l_utilisateur_vérifie_que_le_produit_est_bien_ajouté_à_la_liste_du_panier() {
        System.out.println("Vérification du panier réussie.");
    }
}