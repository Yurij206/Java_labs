enum Colors {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;
    static Colors getRed() {
        return RED;
    }
    static Colors getGreen() {
        return GREEN;
    }
    static Colors getBlue() {
        return BLUE;
    }
}
public class Task7 {
    public static void main(String[] args) {
        System.out.println(Colors.getRed());
        System.out.println(Colors.getGreen());
        System.out.println(Colors.getBlue());
    }
}
