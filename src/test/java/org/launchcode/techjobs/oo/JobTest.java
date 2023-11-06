package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {


    @Test
    public void testSettingJobId() {

        Job objJob1 = new Job();
        Job objJob2 = new Job();

        assertNotEquals(objJob1.getId(), objJob2.getId());
    }

    //TODO: Create your unit tests here
    @Test
    public void testJobConstructorSetsAllFields() {

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().toString());
        assertEquals("Desert", testJob.getLocation().toString());
        assertEquals("Quality control", testJob.getPositionType().toString());
        assertEquals("Persistence", testJob.getCoreCompetency().toString());


    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = String.valueOf(testJob.toString().charAt(0));
        String actual = System.lineSeparator();
        assertEquals(expected, actual);
        String expected2 = String.valueOf(testJob.toString().charAt(testJob.toString().length()-1));
        assertEquals(expected2, actual);



    }

        @Test
        public void testToStringContainsCorrectLabelsAndData (){
            Job testedJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertEquals(lineSeparator() + "ID: " + testedJob.getId() + lineSeparator() + "Name: " + testedJob.getName() + lineSeparator() + "Employer: " + testedJob.getEmployer() + lineSeparator() + "Location: " + testedJob.getLocation() + lineSeparator() + "PositionType: " + testedJob.getPositionType() + lineSeparator() + "CoreCompetency: " + testedJob.getCoreCompetency() + lineSeparator(), testedJob.toString());

    }


        @Test
        public void testToStringHandlesEmptyField () {
            Job againTestJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals(lineSeparator() + "ID: " + againTestJob.getId() + lineSeparator() + "Name: " + "Data not available" + lineSeparator() + "Employer: " + "Data not available" + lineSeparator() + "Location: " + "Data not available" + lineSeparator() + "PositionType: " + "Data not available" + lineSeparator() + "CoreCompetency: " + "Data not available" + lineSeparator(), againTestJob.toString());
        }




}







