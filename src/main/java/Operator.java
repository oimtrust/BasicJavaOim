public class Operator {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 4;
        boolean isGreaterThanSix;

        // Operator &&
        isGreaterThanSix = (value2 > 6) && (value1++ > 6);
        System.out.println( "Value 1 berjumlah: " + value1);
        System.out.println( "Value 2 berjumlah: " + value2);
        System.out.println( "Status: " + isGreaterThanSix);



        // Operator &
        isGreaterThanSix = (value2 > 6) & (value1++ > 6);
        System.out.println( "Value 1 berjumlah: " + value1);
        System.out.println( "Value 2 berjumlah: " + value2);
        System.out.println( "Status: " + isGreaterThanSix);

        //Operator >
        if (value1 > value2) {
            System.out.println("Horeee... Anda benar");
        } else {
            System.out.println("Haduwh... Jawaban Anda salah");
        }
        System.out.println(value1 > value2);

        // Operator >=
        System.out.println(value1 >= value2);

        // Operator <
        System.out.println(value1 < value2);

        // Operator <=
        System.out.println(value1 <= value2);

        // Operator ==
        System.out.println(value1 == value2);

        // Operator !=
        System.out.println(value1 != value2);
    }
}
