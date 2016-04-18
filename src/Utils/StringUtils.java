package Utils;

import Utils.String.CamelCase;
import Utils.String.CheckPalindrome;
import Utils.String.Reverse;

/**
 * @author Dhruv
 * @Version 1.0
 *
 * Class to implement all the Utils.String Util methods. The is the middleware class, which passes the call to the respective function.
 *
 * @Contains Classes: toCamelCase;
 */
public class StringUtils {

    /**
     * @Version - 1.0
     * -- Not the actual implementation method. --
     * Converts this String literal into a Camel Case. Such that each word begins with a capital letter.
     * Also removes any trailing or leading whitespaces.
     *
     * Example: toCamelCase("wE are tHe monks.!")  -> -> -> "We Are The Monks.!"
     *
     * @param str: The input String which is to be converted.
     * @return : the String after being converted to camel case
     */
    public static String toCamelCase(String str){ return new CamelCase().toCamelCase(str); }

    public static boolean checkIfPalindrome(String str){ return new CheckPalindrome().checkIfPalindrome(str); }

    public static boolean checkIfPalindromeIgnoreCase(String str){ return new CheckPalindrome().checkIfPalindromeIgnoreCase(str); }

    public static String reverse(String str){ return new Reverse().reverse(str); }

    public static String reverseSafe(String str){ return new Reverse().reverseSafe(str); }
}