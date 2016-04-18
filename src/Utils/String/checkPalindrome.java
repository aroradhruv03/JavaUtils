package Utils.String;

/**
 * @author Dhruv
 * @version 1.0
 * Date - 4/18/2016
 */
public class CheckPalindrome {


    /** This method is case sensitive.
     * Will check for some basic conditions first. Then will call method checkPalindrome().
     **/
    public boolean checkIfPalindrome(String str){

        // If string null or length is 0. Not a palindrome.
        if (str==null || str.length()==0)
            return false;

        // If string length is 1. Is a palindrome.
        if (str.length()==1)
            return true;

        return checkPalindrome(str);
    }

    /** This method is NOT case sensitive.
     * Will check for some basic conditions first. Then will call method checkPalindrome().
     **/
    public boolean checkIfPalindromeIgnoreCase(String str){

        // If string null or length is 0. Not a palindrome.
        if (str==null || str.length()==0)
            return false;

        // If string length is 1. Is a palindrome.
        if (str.length()==1)
            return true;

        str = str.toLowerCase();
        return checkPalindrome(str);
    }

    /**
     * Checks if the given string literal is a palindrome or not.
     *
     * Implementation : Checks the first and last digits. Then second and second last & so on...
     * Note: I Find this implementation better than converting a string to reverse and then using equals method.
     *
     * Possible bugs/problems or Future Upgrades -> NA
     *
     * @param str: The input String which is to be checked.
     * @return : true if string is a palindrome else false
     * throws : No exception thrown. If string is null, just returns false.
     */
    private boolean checkPalindrome(String str)
    {
        boolean palindrome = true;

        int firstIndex = 0, lastIndex = str.length()-1, halfLength = (str.length()/2)-1 ;

        while(firstIndex <= halfLength)
        {
            if(str.charAt(firstIndex)!=str.charAt(lastIndex)) {
                palindrome = false;
                break;
            }
            firstIndex++;
            lastIndex--;
        }
        return palindrome;
    }
}
