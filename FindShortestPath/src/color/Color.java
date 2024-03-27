package color;

/**
 * color.Color class, it is using for drawing map as png
 */
public enum Color {
    WHITE, RED, BLACK, BLUE;

    /**
     * getter for color.Color
     * @return returns RGB color as int
     */
    public int getColor()
    {
        return switch (this) {
            case WHITE -> 16777215;
            case RED -> 16711680;
            case BLACK -> 2171934;
            case BLUE -> 5806296;
            default -> -1;
        };
    }
}
