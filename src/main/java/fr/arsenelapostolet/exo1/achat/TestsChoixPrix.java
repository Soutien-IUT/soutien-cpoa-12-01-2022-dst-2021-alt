package fr.arsenelapostolet.exo1.achat;

import fr.arsenelapostolet.exo1.achat.choix.ChoixPrix;
import fr.arsenelapostolet.exo1.achat.produit.Produit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsChoixPrix {

    @Test
    public void choixProduit_vsProductWithSuperiorPrice_chooseThisProduct(){
        // Given
        ChoixPrix choixProduit = new ChoixPrix();
        Produit produit1 = new Produit(choixProduit, 1, 10);
        Produit produit2 = new Produit(choixProduit, 1, 20);

        // When
        Produit result = produit1.meilleur(produit2);

        // Then
        assertEquals(produit1,result);
    }

    @Test
    public void choixProduit_vsProductWithInferiorPrice_chooseOtherProduct(){
        // Given
        ChoixPrix choixProduit = new ChoixPrix();
        Produit produit1 = new Produit(choixProduit, 1, 20);
        Produit produit2 = new Produit(choixProduit, 1, 10);

        // When
        Produit result = produit1.meilleur(produit2);

        // Then
        assertEquals(produit2,result);
    }

}
