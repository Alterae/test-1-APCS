package console;

/**
 * Class containing console.Ansi escape codes.
 */
public class Ansi {
    /* FOREGROUND COLORS */

    // NORMAL

    /**
     * Sets the foreground color to black.
     */
    public static final String FG_BLACK = "\u001b[30m";
    /**
     * Sets the foreground color to red.
     */
    public static final String FG_RED = "\u001b[31m";
    /**
     * Sets the foreground color to green.
     */
    public static final String FG_GREEN = "\u001b[32m";
    /**
     * Sets the foreground color to yellow.
     */
    public static final String FG_YELLOW = "\u001b[33m";
    /**
     * Sets the foreground color to blue.
     */
    public static final String FG_BLUE = "\u001b[34m";
    /**
     * Sets the foreground color to magenta.
     */
    public static final String FG_MAGENTA = "\u001b[35m";
    /**
     * Sets the foreground color to cyan.
     */
    public static final String FG_CYAN = "\u001b[36m";
    /**
     * Sets the foreground color to white.
     */
    public static final String FG_WHITE = "\u001b[37m";

    // BRIGHT

    /**
     * Sets the foreground color to bright black.
     */
    public static final String FG_BLACK_BR = "\u001b[30;1m";
    /**
     * Sets the foreground color to bright red.
     */
    public static final String FG_RED_BR = "\u001b[31;1m";
    /**
     * Sets the foreground color to bright green.
     */
    public static final String FG_GREEN_BR = "\u001b[32;1m";
    /**
     * Sets the foreground color to bright yellow.
     */
    public static final String FG_YELLOW_BR = "\u001b[33;1m";
    /**
     * Sets the foreground color to bright blue.
     */
    public static final String FG_BLUE_BR = "\u001b[34;1m";
    /**
     * Sets the foreground color to bright magenta.
     */
    public static final String FG_MAGENTA_BR = "\u001b[35;1m";
    /**
     * Sets the foreground color to bright cyan.
     */
    public static final String FG_CYAN_BR = "\u001b[36;1m";
    /**
     * Sets the foreground color to bright white.
     */
    public static final String FG_WHITE_BR = "\u001b[37;1m";

    /* BACKGROUND COLORS */

    // NORMAL

    /**
     * Sets the background color to black.
     */
    public static final String BG_BLACK = "\u001b[40m";
    /**
     * Sets the background color to red.
     */
    public static final String BG_RED = "\u001b[41m";
    /**
     * Sets the background color to green.
     */
    public static final String BG_GREEN = "\u001b[42m";
    /**
     * Sets the background color to yellow.
     */
    public static final String BG_YELLOW = "\u001b[43m";
    /**
     * Sets the background color to blue.
     */
    public static final String BG_BLUE = "\u001b[44m";
    /**
     * Sets the background color to magenta.
     */
    public static final String BG_MAGENTA = "\u001b[45m";
    /**
     * Sets the background color to cyan.
     */
    public static final String BG_CYAN = "\u001b[46m";
    /**
     * Sets the background color to white.
     */
    public static final String BG_WHITE = "\u001b[47m";

    // BRIGHT

    /**
     * Sets the background color to bright black.
     */
    public static final String BG_BLACK_BR = "\u001b[40;1m";
    /**
     * Sets the background color to bright red.
     */
    public static final String BG_RED_BR = "\u001b[41;1m";
    /**
     * Sets the background color to bright green.
     */
    public static final String BG_GREEN_BR = "\u001b[42;1m";
    /**
     * Sets the background color to bright yellow.
     */
    public static final String BG_YELLOW_BR = "\u001b[43;1m";
    /**
     * Sets the background color to bright blue.
     */
    public static final String BG_BLUE_BR = "\u001b[44;1m";
    /**
     * Sets the background color to bright magenta.
     */
    public static final String BG_MAGENTA_BR = "\u001b[45;1m";
    /**
     * Sets the background color to bright cyan.
     */
    public static final String BG_CYAN_BR = "\u001b[46;1m";
    /**
     * Sets the background color to bright white.
     */
    public static final String BG_WHITE_BR = "\u001b[47;1m";

    /* Misc */

    /**
     * Draws text in bold.
     * <p>
     * Note: On some terminals, this will render using bright colors instead.
     */
    public static final String BOLD = "\u001b[1m";
    /**
     * Draws text underlined.
     */
    public static final String UNDERLINE = "\u001b[4m";
    /**
     * Reverses the background and foreground colors.
     */
    public static final String REVERSED = "\u001b[7m";

    /* Reset */

    /**
     * Resets all text coloring and decoration.
     */
    public static final String RESET = "\u001b[0m";
}
