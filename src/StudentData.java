public class StudentData {
    private String name;
    private String id;

    private double[] marks;

    public StudentData(String name, String id, double[] marks) {
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

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    // Student Activities mark , Oral/Practical mark ,  Midterm exam mark , Final exam mark
    StudentData() {

    }


}
