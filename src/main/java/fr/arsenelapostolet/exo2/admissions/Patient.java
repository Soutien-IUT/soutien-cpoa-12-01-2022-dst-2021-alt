package fr.arsenelapostolet.exo2.admissions;

public abstract class Patient {
	private int numeroDeSecuriteSociale;
	private double temperature;
	
	public Patient(int nss, double temperature) {
		this.numeroDeSecuriteSociale = nss;
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public abstract boolean hasFievre();
	public abstract boolean hasConditionPreexistante();

	public abstract String getMessageAdmis();

	public String admission(){
		return this.hasFievre() && this.hasConditionPreexistante()
				? getMessageAdmis() : "Pas d'admission aux urgences";
	}
}
