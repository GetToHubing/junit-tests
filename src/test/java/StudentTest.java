import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class StudentTest {
    Student student1;
    @Before
    public void testSetUp() {
        this.student1 = new Student(2, "david");
    }

    @Test
    public void studentNullTest() {
        assertNotNull(student1);
    }

    @Test
    public void getIdTest() {
        assertEquals(1, student1.getId());
    }

    @Test
    public void getNameTest() {
        assertEquals("david", student1.getName());
    }

    @Test
    public void getGradeTest() {
        assertNotNull(student1.getGrades());
    }
    @Test
    public void addGradeTest() {
        assertTrue(student1.getGrades().isEmpty());//assumes arraylist is empty in beginning
        student1.addGrade(84);
        assertFalse(student1.getGrades().isEmpty());//assume arraylist isn't empty after adding to it
    }

    @Test
    public void getGradeAverageTest() {
        student1.addGrade(85);
        student1.addGrade(92);
        assertEquals((85 + 92) / 2, student1.getGradeAverage());
    }

    @Test
    public void updateGradeTest() {
        student1.addGrade(85);
        student1.addGrade(92);
        student1.updateGrade(85, 100);
        assertSame(100, student1.getGrades().get(0));
    }

    @Test
    public void deleteGradeTest() {
        student1.addGrade(85);
        student1.addGrade(92);
        student1.deleteGrade(85);
        assertEquals(1, student1.getGrades().size());
    }

}
