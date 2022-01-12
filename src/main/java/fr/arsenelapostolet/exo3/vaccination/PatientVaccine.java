package fr.arsenelapostolet.exo3.vaccination;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientVaccine implements IPatient {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

    private final IPatient patient;
    private final String nomVaccin;
    private final LocalDate dateVaccin;

    public PatientVaccine(IPatient patient, String nomVaccin, LocalDate dateVaccin) {
        this.patient = patient;
        this.nomVaccin = nomVaccin;
        this.dateVaccin = dateVaccin;
    }

    @Override
    public String getNom() {
        return this.patient.getNom();
    }

    @Override
    public int getNss() {
        return this.patient.getNss();
    }

    @Override
    public String getSituation() {
        return this.patient.getSituation() + System.lineSeparator()
                + String.format("Vaccine avec : %s, le %s", this.nomVaccin, formatter.format(this.dateVaccin));
    }

    @Override
    public void ajouterMaladie(String maladie) {
        this.patient.ajouterMaladie(maladie);
    }
}
