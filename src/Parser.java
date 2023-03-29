import java.io.BufferedReader;
import java.io.*;

import java.util.ArrayList;
public class Parser {
    private BufferedReader bufread;
    Parser(BufferedReader bufread) {
    this.bufread = bufread;
    }

    ArrayList<StudentData> parse() {
        String myline;
        ArrayList<StudentData> dataArr = new ArrayList<>();
        try{
            while((myline = this.bufread.readLine()) != null) {
                
                String[] fields =  myline.split(",");
                String name = fields[0];
                String id = fields[1];
                ArrayList<Double> marks = new ArrayList<>(4);
                for (int i = 2; i < fields.length; i++) {
                    marks.add(Double.valueOf(fields[i]));
                }
                StudentData studentData = new StudentData();
                studentData.setId(id);
                studentData.setName(name);
                studentData.setMarks(marks);

                Validation.IsStudentDataTrue(studentData);
                dataArr.add(studentData);
            }

        } catch(IOException e) {
            System.out.println("Exception: " +e);
        }
        return  dataArr;
    }
}
