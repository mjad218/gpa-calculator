
public class Validation {
    public  static void IsStudentDataTrue(StudentData student) {
        if (!(student.getName().matches("^[A-Za-z][A-Za-z ]*$"))) {
            throw new IllegalArgumentException("Invalid student name");
        }
        if (student.getId().matches("^[0-9]{7}[A-Za-z]?$")){
           throw new IllegalArgumentException("Invalid student id");
        }
        if (!(student.getMarks().get(0) >= 0 && student.getMarks().get(0)  <= 10)) {
            throw new IllegalArgumentException("Invalid activity mark");
        }
        if (!(student.getMarks().get(1)  >= 0 && student.getMarks().get(1)  <= 10)) {
            throw new IllegalArgumentException("Invalid oral/practical mark");
        }
        if (!(student.getMarks().get(2)  >= 0 && student.getMarks().get(2)  <= 20)) {
            throw new IllegalArgumentException("Invalid midterm exam mark");
        }
        if (!(student.getMarks().get(3)  >= 0 && student.getMarks().get(3)  <= 60)) {
            throw new IllegalArgumentException("Invalid final exam mark");
        }
}
}
