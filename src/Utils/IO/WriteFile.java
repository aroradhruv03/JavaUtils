package Utils.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
public class WriteFile {

    Boolean fileOverride = true;

    /**
     * Use  to copy the source file to a new file
     * @param oldFileName
     * @param newFileName
     * @return
     */
    public boolean copyFile(String oldFileName, String newFileName)
    {
        ReadFile r = new ReadFile(oldFileName);

        createFile(newFileName);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try{
            // Assume default encoding
            // true denotes file will not be overwritten each time, but will insert data in same file
            fileWriter = new FileWriter(newFileName,true);
            //wrap FileWriter in BufferedWriter
            bufferedWriter= new BufferedWriter(fileWriter);

            // Write the data in a single line
            String line;
            while ((line = r.readNext())!=null) {
                bufferedWriter.write(line);
                //Goto next line.. so that next time record will be added in the next line
                bufferedWriter.newLine();
            }
	        /*
	         * Will add checksum functionality later and will add back files later
	         */

            // close and flush connections
            fileWriter.flush();
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();

            // If successful return true;
//			System.out.println("Record saved successfully");
            return true;
        }
        catch(Exception exception)
        {
//			System.out.println("Exception during save: ");
            exception.printStackTrace();
        }
        // If failed return false
//		System.out.println("Coudn't Save ...");
        return false;
    }

    /**
     * TODO
     * @param fileName
     * @return
     */
    public boolean replaceFile(String fileName){
        return false;
    }



    /*
	 * This method creates a file at the above given path.
	 * Method is private and not available outside this class.
	 */
    private void createFile(String fName)
    {
        // Create a fileHandle for File Creation
        File fileHandle = new File(fName);

        try {

            //Create the File
            fileHandle.createNewFile();
//			System.out.println("\tFile created");
        }
        catch (IOException ioException)
        {
            // Some I/O Failure
//			System.out.println("File create error: ");
            ioException.printStackTrace();
        }
    }
}
