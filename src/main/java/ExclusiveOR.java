public class ExclusiveOR {
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = true;

        // true ^ true
        System.out.println(value1 ^ value2);

        value1 = false;
        // false ^ true
        System.out.println(value1 ^ value2);

        value1 = true;
        System.out.println(value1 ^ value2);
    }
}
