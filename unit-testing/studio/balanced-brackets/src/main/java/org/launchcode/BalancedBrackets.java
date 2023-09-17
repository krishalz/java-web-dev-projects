package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) { //this method takes in a string; returns a boolean
        //static method means we just call it on the class
        int brackets = 0;

        for (char ch : str.toCharArray()) { //goes through string, line by line,
            //ensure closing bracket doesn't come first
            if (brackets >= 0) {

                // split it out into an array and look at every character through the variable ch
                if (ch == '[') {
                    brackets++;  //increments when it finds an open bracket
                } else if (ch == ']') {
                    brackets--;  //decrements when it finds a closing bracket
                }
            } else {
                return false;
            }
        }
        return brackets == 0; //returns true if increment and decrements ended up being 0
    }
}