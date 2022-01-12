package fr.arsenelapostolet.exo3.vaccination;

import java.util.ArrayList;
import java.util.List;

public class Patient implements IPatient {
	private int nss;
	private String nom;
	private List<String> maladies = new ArrayList<>();
	
	public Patient(int nss, String nom) {
		this.nss = nss;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNss() {
		return nss;
	}
	
	public void ajouterMaladie(String maladie) {
		maladies.add(maladie);
	}
	
	public String getSituation () {
		String t = "Je m'appelle " + nom;
		for (String m : maladies)
			t+=" " + m;
		return t;
	}
}
