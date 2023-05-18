package ex7;

public enum Color {
    BLACK(0, 0, 0),
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    CYAN(102, 205, 170),
    MAGENTA (255, 0, 255),
    YELLOW(205, 92, 92),
    WHITE(255, 255, 255);

    private int r;
    private int g;
    private int b;
    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public int getRed() {
        return r;
    }

    public int getGreen() {
        return g;
    }

    public int getBlue() {
        return b;
    }
}
