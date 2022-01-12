package fr.arsenelapostolet.exo2.admissions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestsAdmissionAuxUrgences {

	@Test
	void testEnfantSansAdmission() {
		Enfant a = new Enfant(1, 38, false);
		assertEquals("Pas d'admission aux urgences", a.admission());
	}
	
	@Test
	void testEnfantAvecAdmission() {
		Enfant a = new Enfant(1, 38.5, true);
		assertEquals("Admission aux urgences enfants", a.admission());
	}
	
	@Test
	void testAdulteSansAdmission() {
		Adulte a = new Adulte(1, 37, 16);
		assertEquals("Pas d'admission aux urgences", a.admission());
	}
	
	@Test
	void testAdulteAvecAdmission() {
		Adulte a = new Adulte(1, 40, 19);
		assertEquals("Admission aux urgences adultes", a.admission());
	}

}
