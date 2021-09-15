public class OperatorCondition {
    public static void main(String[] args) {
        int value1 = 8;
        int value2 = 4;

        int greaterValue = ( value1 > value2) ? value1 : value2;

        System.out.println(greaterValue);

        if (value1 > value2) {
            System.out.println(value1);
        } else if(value2 < value1){
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }

    }
}
