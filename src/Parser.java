import java.io.BufferedReader;


import java.io.*;

import java.util.Scanner;
public class Parser {
    private BufferedReader bufread;
    Parser(BufferedReader bufread) {
    this.bufread = bufread;
    }

    StudentData[] parse() {
        String myline;
        StudentData[] dataArr = null;
        try{
            while((myline = this.bufread.readLine()) != null) {
                System.out.println(myline);
                String[] fields =  myline.split(",");
                //John Doe,12345678,8,9,18,50
                for (String a : fields)
                    System.out.println(a);
                StudentData data = new StudentData();
            }

        } catch(IOException e) {
            System.out.println("Exception: " +e);
        }
        return  dataArr;
    }
}
