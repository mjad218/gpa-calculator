import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String myfile;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        myfile = scan.nextLine();
        try
        {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufread = new BufferedReader(fileReader);
           String str1 = bufread.readLine();
            System.out.println(str1);
            Parser parser = new Parser(bufread);
     
            ArrayList<StudentData> data = parser.parse();
            // reading the file, line by line
            String str = "";//str1 + "\n";
            for(int i = 0 ; i < data.size(); i++ ) {
                StudentData sData = data.get(i);
                PrintWriter out = new PrintWriter("out.txt");
                out.println('n');
                str += sData.getGpa().toString() + ' ' + sData.getGrade()  + ' ' + sData.getName() + '\n';
                System.out.println(sData.getGpa().toString() + ' ' + sData.getGrade()  + ' ' + sData.getName());
            }
            outToFile(str);
//            while((myline = bufread.readLine()) != null)
//                System.out.println(myline);

            bufread.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception: " +e);
        }

    }

    static void outToFile(String str) {
        try {
            File path = new File("C:\\Users\\aliel\\Desktop\\testing project\\gpa-calculator\\outh.txt");

            //passing file instance in filewriter
            FileWriter wr = new FileWriter(path);

            //calling writer.write() method with the string
            wr.write(str);

            //flushing the writer
            wr.flush();

            //closing the writer
            wr.close();

        } catch (Error | IOException e) {

        }
    }
}