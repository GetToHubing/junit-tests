import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CohortTest {

    Student student1;
    Student student2;
    Cohort azaban;

    @Before
    public void makeStudent() {
        azaban = new Cohort();
        student1 = new Student(1, "david");
        student2 = new Student(2, "josh");
        azaban.addStudent(student1);
        azaban.addStudent(student2);
        student2.addGrade(89);
        student1.addGrade(76);
    }

    @Test
    public void addStudentToCohortTest() {
        assertEquals(1, azaban.getStudents().size());
    }

    @Test
    public void getStudentsTest() {
        assertEquals(1, azaban.getStudents().get(0).getId());
    }

    @Test
    public void getCohortAverageTest() {
        assertEquals(82.2, azaban.getCohortAverage(), .5);
    }


}


