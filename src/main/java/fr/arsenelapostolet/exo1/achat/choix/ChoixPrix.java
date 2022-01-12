package fr.arsenelapostolet.exo1.achat.choix;

import fr.arsenelapostolet.exo1.achat.produit.ChoixProduit;
import fr.arsenelapostolet.exo1.achat.produit.Produit;

public class ChoixPrix implements ChoixProduit {
    @Override
    public Produit choisirProduit(Produit produit1, Produit produit2) {
        if (produit1.getPrix() < produit2.getPrix()) {
            return produit1;
        } else if (produit1.getPrix() > produit2.getPrix()) {
            return produit2;
        }
        return null;
    }
}
