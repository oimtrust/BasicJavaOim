import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int nilai;
        String nama;

        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Nilai: ");
        nilai = scan.nextInt();

        // Cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }
    }
}
