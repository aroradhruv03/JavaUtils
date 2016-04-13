package Main;

import String.StringUtils;

/**
 * @author Dhruv
 * @Version 1.0
 *
 * Main Class to implement and show as examples the Utils Method implemented
 *
 * @Contains: toCamelCase;
 */
public class MainClass {

    public static void main(String[] args) {

        /** toCamelCase **/
        String s = StringUtils.toCamelCase("wE are tHe monks.!");
        System.out.println(s);
    }
}
