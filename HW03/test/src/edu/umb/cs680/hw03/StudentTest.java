package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void statusOfInStateStudentisINSTATE() {
        Student intl = Student.createInStateStudent("John", "1A");
        assertEquals(StudentStatus.INSTATE, intl.getStatus());
    }

    @Test
    public void statusOfOutStateStudentisOUTSTATE() {
        Student intl = Student.createOutStateStudent("John", "1A", 3);
        assertEquals(StudentStatus.OUTSTATE, intl.getStatus());
    }

    @Test
    public void statusOfIntlStudentisINTL() {
        Student intl = Student.createIntlStudent("John", "1A", 1234, "2B");
        assertEquals(StudentStatus.INTL, intl.getStatus());
    }

    @Test
    public void tuitionOfInStateStudentis1000() {
        Student intl = Student.createInStateStudent("John", "1A");
        assertEquals(1000, intl.getTuition());
    }

    @Test
    public void tuitionOfOutStateStudentis2500() {
        Student intl = Student.createOutStateStudent("John", "1A", 3);
        assertEquals(2500, intl.getTuition());
    }

    @Test
    public void tuitionOfIntlStudentis5000() {
        Student intl = Student.createIntlStudent("John", "1A", 1234, "2B");
        assertEquals(5000, intl.getTuition());
    }
}
