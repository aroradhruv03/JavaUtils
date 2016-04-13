package String.Utils;

/**
 * @author Dhruv
 * @Version 1.2
 */

public class CamelCase{

    /**
     * @Version - 1.2
     * Converts this String literal into a Camel Case. Such that each word begins with a capital letter.
     * Also removes any trailing or leading whitespaces.
     *
     * Example: toCamelCase("wE are tHe monks.!")  -> -> -> "We Are The Monks.!"
     *
     * Uses Java's own toUpper and toLower methods.
     *
     * Possible bugs - Only capitalizes a sentence or word after a 'space' not a 'full-stop'.
     *
     * @param str: The input String which is to be converted.
     * @return : the String after being converted to camel case
     * @throws : NullPointerException if the String encountered was null
     */
    public String toCamelCase(String str) throws NullPointerException{
        str = str.trim();

        int strLength;

        if (str == null)
            throw new NullPointerException("The String entered was null");

        if( (strLength = str.length()) == 0 )
            return "empty string";

        /** Split each line into it's constituent properties, then the result is stored in a string array. **/
        String delimited[] = str.split("\\ ");;

        /** This array will store the result **/
        String camelCase="";

        for(int index=0;index<delimited.length;index++)
        {
            if(delimited[index].length()>0)
            {
                String s1 = new StringBuilder(strLength)
                        .append(delimited[index].substring(0, 1).toUpperCase())
                        .append(delimited[index].substring(1).toLowerCase())
                        .toString();
                camelCase = camelCase+" "+s1;
            }
        }
        return camelCase.trim();
    }
}
