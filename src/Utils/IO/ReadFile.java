package Utils.IO;

import b.e.j.a.T;

import java.io.*;
import java.util.ArrayList;

/**
 * @author - Dhruv
 * @version - 1.5
 * Date Started - 15/Sep/2015
 * A class which wraps around BufferedReader, so that you can use this util class methods to implement
 * file Input & Output operations writing as less code as possible.
 *      (i.e. no more worrying about remembering about BufferedReader, try,catch block, etc. Yes I'm making you into one lazy programmer.
 *
 * Uses Java's BufferedReader.
 *
 * Possible bugs/problems or Future Upgrades ->
 *      1.
 **/
public class ReadFile {

    // Will store the file name
    private String fileName;

    // Will store the regex to split each line by. Default is tab-seperated.
    private String regex = "\t";

    private BufferedReader currentReader;

    // Define the Directory and the File path
    private String dirName = "Sample_Inp";

    public ReadFile(String fileName) {
        this.fileName = fileName;
        this.currentReader = initiateBufferedReader();

    }

    public ReadFile(String fileName, String regex) {
        this.fileName = fileName;
        this.regex = regex;
        this.currentReader = initiateBufferedReader();
    }


    private BufferedReader initiateBufferedReader() {
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public String readNext() {
        try {
            // Stores each line
            String line;

            line = currentReader.readLine(); // read a line

            return line;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    /**
     *
     */
    public void printFile()
    {
        try {

            BufferedReader reader = initiateBufferedReader();

            System.out.println("Priting the file: "+fileName+" ->");
            // Stores each line
            String lineRead ;

            while( (lineRead = reader.readLine()) !=null)
            {
                // Do here what you want with the line read, split it or store in array.!
                System.out.println(lineRead);
            }
            System.out.println("### END of file ###");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // TODO
    public ArrayList<T> copyToArray(){

        return null;
    }



    public void cleanUp() {
        try {
            currentReader.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
