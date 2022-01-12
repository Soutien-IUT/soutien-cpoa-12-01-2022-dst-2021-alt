package fr.arsenelapostolet.exo3.vaccination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsVaccins {

    @Test
    public void vacciner_withPfyzez_appearsInSituatin(){
        // Given
        IPatient patient=new Patient(8498494, "John Doe");

        // When
        patient = new PatientVaccine(patient, "Pfyzez", LocalDate.of(2022, 1,4));

        // Then
        assertEquals("Je m'appelle John Doe\r\nVaccine avec : Pfyzez, le 04 01 2022",patient.getSituation());
    }

    @Test
    public void vacciner_withPfyzezAndAstraZeneca_bothAppearInSituation(){
        // Given
        IPatient patient = new Patient(8498494, "John Doe");

        // When
        patient = new PatientVaccine(patient, "Pfyzez", LocalDate.of(2022, 1,4));
        patient = new PatientVaccine(patient, "AstraZeneca", LocalDate.of(2022, 7,4));

        // Then
        assertEquals("Je m'appelle John Doe\r\nVaccine avec : Pfyzez, le 04 01 2022\r\n" +
                "Vaccine avec : AstraZeneca, le 04 07 2022",patient.getSituation());
    }


}
