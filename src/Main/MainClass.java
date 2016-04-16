package Main;

import Utils.IO.ReadFile;
import Utils.IO.WriteFile;
import Utils.StringUtils;

/**
 * @author Dhruv
 * @version 1.1
 *
 * Main Class to implement the required utility as an example.
 *
 * Include Usage Examples: toCamelCase;
 */
public class MainClass {

    public static void main(String[] args) {

        /** toCamelCase Usage Example **/
        String outputString = StringUtils.toCamelCase("wE are tHe monks.!");
        System.out.println("*** Camel Case Example ***");
        System.out.println("Input: \"wE are tHe monks.!\"");
        System.out.println("Output: \""+outputString+"\"");




        /** Using ReadFile - Usage Example - To Read a file **/

        ReadFile r = new ReadFile("Sample_Inp/SampleInput.txt"); // Give foldername and filename
        System.out.println(r.readNext()); // Use r.readNext() to read a Line
        System.out.println(r.readNext());
        System.out.println(r.readNext()); // Prints null upon reaching EndOfFile
        System.out.println(r.readNext());
        r.cleanUp(); // Call cleanup after done with reading to close the stream

        /** Using ReadFile - Usage Example - To Read a csv file **/
        ReadFile r2 = new ReadFile("Sample_Inp/SampleCsv.csv",","); // Give foldername and filename
        System.out.println(r2.readNext()); // Use r.readNext() to read a Line

        /** Using ReadFile - Usage Example - To Copy a file contents to another file **/
        WriteFile w = new WriteFile();

        w.copyFile("Sample_Inp/SampleInput.txt", "Output.txt"); // Give foldername and filename


        // TODO Add copy with two parameters, and with lino no option

    }
}


/** TODO Will add the console input if necessary
 Scanner scanner = new Scanner(System.in);
 int input = 1;
 while(input!=0) {
 System.out.println("\nSelect a number.. Please let us know what you want to do");
 System.out.println("1.toCamelCase Example");
 System.out.println("0.Exit");

 input = scanner.nextInt();

 switch (input)
 {
 case 1:
 break;
 }
 } **/