package Dictionary;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> days = new HashMap<>();

        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jumat");
        days.put(7, "Sabtu");

        System.out.println("Keterangan hari sebelum ada yang terhapus");
        System.out.println("Isi object days " + days);
        System.out.println("Hari kedua adalah hari " + days.get(2));

        /**
         * Method untuk menghapus ada 2
         * remove()    ===> menghapus salah satu nilai
         *
         * clear()    ===> menghapus semua nilai
         */

        /**
         * Mengubah Nilai dan kunci hashmap
         *
         * replace()  ===> Untuk mengubah nilai
         *
         * put()  ===> Mnembahkan nilai baru (kunci)
         */

        days.put(1, "Ahad");
        days.replace(4, "Rabo");
        System.out.println("Mencetak nilai " + days);

        System.out.println("==================== = = = = = =     ====    =====  ==========");
        System.out.println("Salah satu hari yang dihapus yaitu hari " + days.get(7));
        days.remove(7);
        System.out.println("Isi object days " + days);

        System.out.println("==================== = = = = = =     ====    =====  ==========");
        System.out.println("Semua hari dihapus ");
        days.clear();
        System.out.println("Isi object days: " + days);
    }
}
