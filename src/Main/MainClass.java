package Main;

import Utils.IO.ReadFile;
import Utils.IO.WriteFile;
import Utils.StringUtils;

/**
 * @author Dhruv
 * @version 1.2
 *
 * Main Class to implement the required utilities as an example.
 *
 * Include Usage Examples: toCamelCase; Palindrome
 */
public class MainClass {

    public static void main(String[] args) {

        /** toCamelCase Usage Example **/
        String outputString = StringUtils.toCamelCase("wE are tHe monks.!");
        System.out.println("*** Camel Case Example ***");
        System.out.println("Input: \"wE are tHe monks.!\"");
        System.out.println("Output: \""+outputString+"\"");
        /** **/

        /** CheckPalindrome Usage Example **/
        System.out.println("\n*** Palindrome Case Example ***");
        String sampleString = " a!sdf#DS ";
        boolean palindrome = StringUtils.checkIfPalindrome(sampleString);
        System.out.println("Is the string a palindrome?: "+palindrome);
        /** **/

        /** Reverse Usage Example **/
        System.out.println("\n*** Reverse Case Example ***");
        System.out.println("Original String: "+sampleString);
        System.out.println("Reverse: "+StringUtils.reverse(sampleString));
        System.out.println("Safe Reverse: "+StringUtils.reverseSafe(sampleString));
        /** **/


        /** Using ReadFile - Usage Example - To Read a file **/
        System.out.println("\n*** File IO - Read Example ***");
        // Give folder name and filename. Here it assumes the file is tab separated
        ReadFile r = new ReadFile("Sample_Inp/SampleInput.txt");

        String lineRead; // Will store the line that is read

        // Use r.readNext() to read the next Line
        // Use this Loop to run till the end of file
        while( (lineRead = r.readNext()) !=null)
        {
            // Do here what you want with the line read, split it or store in array.!
            System.out.println(lineRead);
        }

        r.cleanUp(); // Call cleanup after done with reading to close the stream
        /** **/


        /** Using ReadFile - Usage Example - To Read a csv file (Experimental) **/
        // Give folder name and filename, along with optional parameter
        ReadFile r2 = new ReadFile("Sample_Inp/SampleCsv.csv", ",");
        System.out.println(r2.readNext()); // Use r.readNext() to read a Line

        /** Using ReadFile - Usage Example - To Copy a file contents to another file **/
        WriteFile w = new WriteFile();
        w.copyFile("Sample_Inp/SampleInput.txt", "Output.txt"); // Give foldername and filename
        /** **/


        // TODO Add copy with two parameters, and with lino no option

    }
}


/** TODO Will add the console to get user input if necessary
 Scanner scanner = new Scanner(System.in);
 int input = 1;
 while(input!=0) {
 System.out.println("\nSelect a number.. Please let us know what you want to do");
 System.out.println("1.toCamelCase Example");
 System.out.println("2.Palindrome Example");
 System.out.println("3.IO Example");
 System.out.println("0.Exit");

 input = scanner.nextInt();

 switch (input)
 {
 case 1:
 break;
 }
 } **/