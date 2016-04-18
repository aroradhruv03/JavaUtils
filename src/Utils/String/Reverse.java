package Utils.String;

/**
 * @author Dhruv
 * @version 1.0
 * Date - 4/18/2016
 */
public class Reverse {

    /**
     * Finds out the reverse of a string and returns it. Method is case sensitive. But it does not deal with UTF-16 surrogate pairs.
     *
     * Implementation : Converts string to char array. Checks the first and last digits and swaps them. Then second and second last & so on...
     * Note: Many methods are there, also a recursive one is there, but find this cleaner.
     *
     * Possible bugs/problems or Future Upgrades -> NA
     *
     * @param str: The input String which is to be converted.
     * @return : reverse of the string.
     * throws : No exception thrown. If string is null, just returns the string.
     */
    public String reverse(String str)
    {
        // If string null or length is 0 or 1. Return the string as is.
        if (str == null || str.length()==0 || str.length()==1)
            return str;

        char strArray[] = str.toCharArray();
        char temp;

        for(int i=0,j = strArray.length-1; i <= j/2 ; i++,j--)
        {
            temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j]=temp;
        }

        str = String.valueOf(strArray);
        return str;
    }

    /**
     * Finds out the reverse of a string and returns it. Method is case sensitive. Deals with UTF-16 surrogate pairs.
     *
     * Implementation : Uses Java's StringBuilder reverse library.
     *
     * Possible bugs/problems or Future Upgrades -> NA ( If there write to Oracle :p )
     *
     * @param str: The input String which is to be converted.
     * @return : reverse of the string.
     * throws : No exception thrown. If string is null, just returns the string.
     */
    public String reverseSafe(String str)
    {
        // If string null or length is 0 or 1. Return the string as is.
        if (str == null || str.length()==0 || str.length()==1)
            return str;

        StringBuilder string = new StringBuilder(str);
        return String.valueOf(string.reverse());
    }
}
