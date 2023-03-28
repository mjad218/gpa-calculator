import java.util.ArrayList;

enum GPA {
    A,
    MEDIUM,
    HIGH
}

//>= 97 and < =100 4 A+
//        >= 93 and < 97 4 A
//        >= 89 and < 93 3.7 A-
//        >= 84 and < 89 3.3 B+
//        >= 80 and < 84 3 B
//        >= 76 and < 80 2.7 B-
//        >= 73 and < 76 2.3 C+
//        >= 70 and < 73 2 C
//        >= 67 and < 70 1.7 C-
//        >= 64 and < 67 1.3 D+
//        >= 60 and < 64 1 D
//< 60 0 F
public class StudentData {
    private String name;
    private String id;

    private ArrayList<Double> marks;


    private GPA gpa;
    private double grade;

    public StudentData(String name, String id, ArrayList<Double> marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    // Student Activities mark , Oral/Practical mark ,  Midterm exam mark , Final exam mark
    StudentData() {

    }



}
