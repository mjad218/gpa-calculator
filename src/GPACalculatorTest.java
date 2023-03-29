import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GPACalculatorTest {
    StudentData studentData;
    @BeforeAll
    public void init() {

    }
    @Test
    public void gradeOneHundredIsA() {
        studentData = new StudentData();
        ArrayList<Double> arr = new ArrayList<Double>(4);
        arr.add(10.0);
        arr.add(10.0);
        arr.add(10.0);
        arr.add(10.0);
        studentData.setMarks(arr);
        GPA gpa = GPACalculator.calcGPA(studentData);

        assertEquals(gpa, GPA.F);
    }
}