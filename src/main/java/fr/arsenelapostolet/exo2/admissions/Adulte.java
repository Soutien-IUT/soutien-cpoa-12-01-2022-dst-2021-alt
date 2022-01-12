package fr.arsenelapostolet.exo2.admissions;

public class Adulte extends Patient {
	private double tension;	// tension arterielle

	private static double seuilTemparatureFievre = 39;
	private static double seuilHyperTension = 16;

	public Adulte(int nss, double temperature, double tension) {
		super(nss, temperature);
		this.tension = tension;
	}

	@Override
	public boolean hasFievre() {
		return this.getTemperature() >= seuilTemparatureFievre;
	}

	@Override
	public boolean hasConditionPreexistante() {
		return tension > seuilHyperTension;
	}

	@Override
	public String getMessageAdmis() {
		return "Admission aux urgences adultes";
	}
}
