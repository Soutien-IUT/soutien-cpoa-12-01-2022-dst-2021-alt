package fr.arsenelapostolet.exo1.achat.produit;

public class Produit {
	
	private int ref;
	private double prix;
	private int qualite;
	private ChoixProduit choixProduit;
	
	public Produit(ChoixProduit choixProduit, int ref, double prix) {
		this.choixProduit = choixProduit;
		this.ref = ref;
		this.prix = prix;
	}
	
	public int getRef() {
		return ref;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public Produit meilleur (Produit p) {
		return choixProduit.choisirProduit(this, p);
	}
	
}
