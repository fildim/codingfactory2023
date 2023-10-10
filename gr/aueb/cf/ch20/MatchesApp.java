package gr.aueb.cf.ch20;

public class MatchesApp {

    public static void main(String[] args) {

        String s = "red";
        System.out.println(isRed(s));

        String digit = "1";
        System.out.println(isOneDigit(digit));
    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isOneDigit(String s) {
        //return s.matches("[0123456789]");
        return s.matches("\\d");
    }

    public static boolean isOneWordChar(String s) {
        //return s.matches("[a-zA-Z0-9_]");
        return s.matches("\\w");
    }

    public static boolean isNotOneDigit(String s) {
        return s.matches("\\D");
    }

    public static boolean isNotOneWordChar(String s) {
        return s.matches("\\W");
    }

    public static boolean isWhiteSpace(String s) {      //spaces, tabs, newLines
        return s.matches("\\s");
    }

    public static boolean isNotWhiteSpace(String s) {
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s) {
        return s.matches(".");
    }

    public static boolean isWholeString(String s) {
        return s.matches("^.$");
    }

    /*
     * for one digit
     * .        any ASCII
     * ^, $     start and end of string
     * [^]      negation
     * \d, \D   digit, not digit
     * \w, \W   a-zA-Z0-9_, not w
     * \s, \S   space, not space
     */

    public static boolean isZeroOrMoreDigits(String s) {
        return s.matches("\\d*");
    }

    public static boolean isOneOrMoreDigits(String s) {
        return s.matches("\\d+");
    }

    public static boolean isThreeDigits(String s) {
        return s.matches("\\d{3}");
    }

    public static boolean isZeroToThreeDigits(String s) {
        return s.matches("\\d{1,3}");
    }

    public static boolean isMoreThanFiveDigits(String s) {
        return s.matches("\\d{5,}");
    }

    public static boolean isLessThanFiveDigits(String s) {
        return s.matches("\\d{0,5}");
    }

    public static boolean isZeroOrOneDigits(String s) {
        return s.matches("\\d?");
    }

    public static boolean isZeroOrOneAnySymbol(String s) {
        return s.matches(".?");
    }

    public static boolean isValidEmailAddress(String s) {   //athan.andr@xxx.com / .gr, alice@xxx.com / .gr
        return (s.matches("\\w+\\.?\\w+@\\w+\\.(com|gr)"));
    }



}
