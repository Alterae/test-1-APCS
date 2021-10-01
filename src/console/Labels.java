package console;

/**
 * Class holding labels for console output.
 */
public class Labels {
    /**
     * Displays a cyan question mark, followed by a space.
     */
    public static final String QUERY = Ansi.FG_CYAN + "? " + Ansi.RESET;

    /**
     * Displays a red exclamation mark, followed by a space.
     */
    public static final String ERROR = Ansi.FG_RED + "! " + Ansi.RESET;
}
