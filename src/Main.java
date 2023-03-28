import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        String myfile, myline;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        myfile = scan.nextLine();

        try
        {
            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufread = new BufferedReader(fileReader);
            Parser parser = new Parser(bufread);
            ArrayList<StudentData> data = parser.parse();
            // reading the file, line by line
            for(int i = 0 ; i < data.size(); i++ ) {
                StudentData sData = data.get(i);
                System.out.println(sData.getGpa().toString() + ' ' + sData.getGrade()  + ' ' + sData.getName());
            }
//            while((myline = bufread.readLine()) != null)
//                System.out.println(myline);

            bufread.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception: " +e);
        }

    }
}