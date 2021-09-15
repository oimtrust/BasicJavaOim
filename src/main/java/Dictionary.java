import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Object> item = new LinkedHashMap<>();

        String isInput = "Y";

        System.out.println("=================== S I M P L E - I N P U T - D A T A ========================");
        System.out.println("==============================================================================");

        while (isInput.equals("Y") || isInput.equals("y")) {
            System.out.print("Apakah anda ingin memasukkan data baru ? (Y/N) : ");
            isInput = input.next();

            switch (isInput) {
                case "Y":
                    new Dictionary().inputData(input, item);
                    break;

                case "y":
                    new Dictionary().inputData(input, item);
                    break;

                case "N":
                    new Dictionary().showData(item);
                    break;

                case "n":
                    new Dictionary().showData(item);
                    break;

                default:
                    System.out.println("Pilihan anda salah");
            }
        }
    }

    private void showData(Map<String, Object> item) {
        System.out.println("==================================== D A T A - B A R A N G =================================");
        System.out.println("============================================================================================");

        for (String key : item.keySet()) {
            System.out.println("Nama barang : " + key + ", Jumlah : " + item.get(key));
        }
    }

    private void inputData(Scanner input, Map<String, Object> item) {
        System.out.print("Nama barang : ");
        input.nextLine();
        String name = input.nextLine();

//        System.out.println("Jenis Barang : ");
//        input.nextLine();
//        String jenis = input.nextLine();

        System.out.println("Jumlah : ");
        int quantity = input.nextInt();

        item.put(name, quantity);
    }
}
