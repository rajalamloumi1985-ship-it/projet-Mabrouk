Feature: verification des  fonctionnalités du site Mabrouk
# Cas de test TT_TS_01
Scenario: Vérification du menu de la page d'accueil 
    Given  utilisateur accède à la page d'accueil  "https://mabrouk.tn/"
   When  utilisateur survole la souris sur le menu "Femme"
    And utilisateur clique sur le sous-menu "Chemises & Blouses"
    Then  utilisateur est dirigé vers la page de sous-menu et celle-ci s'affiche correctement
# Cas de test TT_TS_02
  Scenario: Consultation des détails d'un produit (Chemises & Blouses)
    Given utilisateur accède à la page "https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/"
    When utilisateur clique sur le produit "COL CLASSIQUE ET COUPE AMPLE"
    Then utilisateur se trouve sur la page du produit et la page s'affiche
# Cas de test TT_TS_03
  Scenario: Ajout d'un produit au panier
    Given la page du produit est affichée via le lien "https://mabrouk.tn/produit/pantalon-large-a-pinces-5/"
   When utilisateur sélectionne la couleur, la taille et clique sur "Ajouter au panier"
    And il accède à la page du panier
    Then utilisateur vérifie que le produit est bien ajouté à la liste du panier 


