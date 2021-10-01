package console;

import java.util.Scanner;

/**
 * Class for console I/O.
 */
public class IO {
    /**
     * Scanner for standard input.
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Prints a formatted string to standard output.
     *
     * @param format the format string.
     * @param args   the arguments referenced by the format string.
     */
    public static void print(String format, Object... args) {
        System.out.printf(format, args);
    }

    /**
     * Prints a formatted string to standard output, terminated with a
     * platform-specific line ending.
     *
     * @param format the format string.
     * @param args   the arguments referenced by the format string.
     */
    public static void println(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }

    /**
     * Prints a formatted string to standard error.
     *
     * @param format the format string.
     * @param args   the arguments referenced by the format string.
     */
    public static void eprint(String format, Object... args) {
        System.err.printf(format, args);
    }

    /**
     * Prints a formatted string to standard error, terminated with a
     * platform-specific line ending.
     *
     * @param format the format string.
     * @param args   the arguments referenced by the format string.
     */
    public static void eprintln(String format, Object... args) {
        System.err.printf(format + "%n", args);
    }

    /**
     * Gets an integer from standard input.
     *
     * @param prompt the prompt to display on the console.
     * @return the integer entered.
     */
    public static int getInt(String prompt) {
        try {
            print(prompt);
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException _e) {
            eprintln(Labels.ERROR + "Invalid input.  Please enter an integer.");
            return getInt(prompt);
        }
    }

    /**
     * Gets a float from standard input.
     *
     * @param prompt the prompt to display on the console.
     * @return the float entered.
     */
    public static float getFloat(String prompt) {
        try {
            print(prompt);
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException _e) {
            eprintln(Labels.ERROR + "Invalid input.  Please enter a number.");
            return getFloat(prompt);
        }
    }

    /**
     * Gets a string from standard input.
     *
     * @param prompt the prompt to display on the console.
     * @return the string entered.
     */
    public static String getString(String prompt) {
        print(prompt);

        return scanner.nextLine();
    }

    /**
     * Gets a boolean input from the user (answered in standard y/n format).
     * Valid "yes" answers include "yes", "YES", "yeah", and anything else
     * starting with the characters 'y' or 'Y'.  The same is true for the "no"
     * responses, which match anything beginning with 'n' or 'N'.
     *
     * @param prompt       the prompt to display on the console.
     * @param defaultValue the default value should the user not choose yes or no.
     * @return true if the user's input begins with 'y', false if it begins with
     * 'n', and `defaultValue` otherwise.
     */
    public static boolean getBoolean(String prompt, boolean defaultValue) {
        // print the prompt *without* a newline
        print(prompt);

        // make this a local var because we really do need it more than once
        // lowercase for case-insensitivity
        var input = scanner.nextLine().toLowerCase();

        // if the user just hit enter we just do the default value
        // this prevents trying to get index 0 of a 0-length string later on
        if (input.length() == 0) {
            return defaultValue;
        }

        // if the first char of the user's input (case-insensitive) is y, we return
        // true.  if it's n, we return false.  otherwise, we return defaultValue.
        return switch (input.charAt(0)) {
            case 'y' -> true;
            case 'n' -> false;
            default -> defaultValue;
        };
    }
}
