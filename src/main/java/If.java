import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int belanja = 0;

        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Total belanjaan: Rp. ");
        belanja = scan.nextInt();

        // Cek apakah dia belanja di atas 100.000
        if (belanja > 100000) {
            System.out.println("Selamat, Anda mendapatkan hadiah!");
        }

        System.out.println("Terima Kasih"); // netbeans

    }
}
