import console.IO;
import console.Labels;

public class Main {
    /**
     * Main method.
     *
     * @param args command-line args we are not using.
     */
    public static void main(String[] args) {
        // we could use recursion for this lol
        // use a do while because we have to run the code at least once anyway
        do {
            // use our existing getInt method to get an integer
            // this will cause issues later if they enter a number less than 1,
            // but the method will at least ensure they enter a valid int
            var num = IO.getInt(Labels.QUERY + "Enter a positive integer: ");
            // run the summation method.  we can do it in the print statement
            // because it is not getting used anywhere else
            IO.println("Original: %s, Result: %s", num, summation(num));
            // default to "yes", and make the Y uppercase to indicate this.
            // just do that right here in the while because we are not using it
            // anywhere else.
            // getBoolean method was written specifically for this program.
        } while (IO.getBoolean(
                Labels.QUERY + "Calculate another? [Y/n] ",
                true
        ));
    }

    /**
     * Summation method.  Calculates... is that num factorial?  IDK.
     * We could totally do this with recursion, but I'm lazy and a for loop
     * should work fine.  If the number is less than one it will return 0
     * because that's how for loops work.
     *
     * @param num the number to operate on.  Should be positive.
     * @return the result.
     */
    private static int summation(int num) {
        var result = 0;
        for (int i = 0; i < num; i++) {
            // add one because f(3) is 1 + 2 + 3, not 0 + 1 + 2
            result += i + 1;
        }
        return result;
    }
}
