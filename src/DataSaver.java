import java.util.Scanner;
import static java.lang.System.out;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class DataSaver 
{ 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String ID = "";
        String email = "";
        String birthYear = "";
        String filePath = "/Users/ianmarr/Documents/CECH/ComputerProgrammingI/FileInspector.java/src/DemoCSV";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        ID = SafeInput.getNonZeroLenString(in, "Enter an ID number");
        email = SafeInput.getNonZeroLenString(in, "Enter your email address");
        birthYear = SafeInput.getNonZeroLenString(in, "Enter your birth year");


        rec(firstName,lastName,ID,email,birthYear,filePath);
    }
    public static void rec(String firstName, String lastName, String ID, String email, String birthYear, String filePath)
    {
        try
        {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bWrite = new BufferedWriter(writer);
            PrintWriter pWrite = new PrintWriter(bWrite);

            pWrite.println(firstName+","+lastName+","+ID+","+email+","+birthYear);
            pWrite.flush();
            pWrite.close();

            JOptionPane.showMessageDialog(null,"Record Saved.");
        }
        catch (Exception E)
        {
            JOptionPane.showMessageDialog(null,"An error occurred. Your record was not saved.");
        }
    }
}


