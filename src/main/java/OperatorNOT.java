public class OperatorNOT {
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(!value1);
        System.out.println(!value2);


        int x = 5;
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}
