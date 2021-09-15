package loop;

public class NestedLoop {
    public static void main(String[] args) {
        // Create the variable
        int x, y;

        // Do x and y loops
        for (x = 0; x <= 5; x++) {
            for (y = 0; y <= 3; y++) {
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
}
