package fr.arsenelapostolet.exo3.vaccination;

public interface IPatient {
	public String getNom();
	public int getNss();
	public String getSituation ();
	public void ajouterMaladie(String maladie);
}
