package String;

import String.Utils.CamelCase;

/**
 * @author Dhruv
 * @Version 1.0
 *
 * Class to implement all the String Util methods. The is the middleware class, which passes the call to the respective function.
 *
 * @Contains Classes: toCamelCase;
 */
public class StringUtils {

    /**
     * @Version - 1.0
     * Converts this String literal into a Camel Case. Such that each word begins with a capital letter.
     * Also removes any trailing or leading whitespaces.
     *
     * Example: toCamelCase("wE are tHe monks.!")  -> -> -> "We Are The Monks.!"
     *
     * @param str: The input String which is to be converted.
     * @return : the String after being converted to camel case
     */
    public static String toCamelCase(String str){
        return new CamelCase().toCamelCase(str);
    }
}