package StepDef;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Helper.Config;

import Pages.HomePageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageMabroukStepDef {
	HomePageMabrouk homepage;
	private String url;
	
	@Given("utilisateur accède à la page d'accueil  {string}")
	public void utilisateur_accède_à_la_page(String url) {
       
        if (Config.driver == null) {
            Config.demarrerNavigateur();
        }
        try {
            Config.driver.get(url);
        } catch (org.openqa.selenium.TimeoutException e) {
            JavascriptExecutor js = (JavascriptExecutor) Config.driver;
            js.executeScript("window.stop();");
        }
    }

	@When("utilisateur survole la souris sur le menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu(String menu) {
		HomePageMabrouk page= new HomePageMabrouk();
		page.survolerMenuFemme( );
	}
	
	@When("utilisateur clique sur le sous-menu {string}")
	public void utilisateur_clique_sur_le_sous_menu(String menuFemme) {
		HomePageMabrouk page= new HomePageMabrouk();
		page.clickOnMenu(menuFemme, menuFemme );
	}
	    
	@Then("utilisateur est dirigé vers la page de sous-menu et celle-ci s'affiche correctement")
	public void utilisateur_est_dirigé_vers_la_page_de_sous_menu_et_celle_ci_s_affiche_correctement() {
	   
	}

}



