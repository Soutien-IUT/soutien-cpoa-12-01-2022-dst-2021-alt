package fr.arsenelapostolet.exo2.admissions;

public class Enfant extends Patient {
	private boolean anemie;
	
	private static double seuilTemparatureFievre = 38.5;

	public Enfant(int nss, double temperature, boolean anemie) {
		super(nss, temperature);
		this.anemie = anemie;
	}

	@Override
	public boolean hasFievre() {
		return this.getTemperature() >= seuilTemparatureFievre;
	}

	@Override
	public boolean hasConditionPreexistante() {
		return this.anemie;
	}

	@Override
	public String getMessageAdmis() {
		return  "Admission aux urgences enfants";
	}
}
