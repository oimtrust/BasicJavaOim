public class Array {
    public static void main(String[] args) {
        String[][] name = {
                {
                    "Bunga",
                    "Citra Lestari"
                },
                {
                    "Fiki",
                    "Naki"
                }
        };

        for (int baris = 0; baris < name.length; baris++) {
            for (int kolom = 0; kolom < name[baris].length; kolom++) {
                System.out.println("Baris ke-" + baris + " Kolom ke-" + kolom + " Terisi " + name[baris][kolom]);
            }
        }
    }
}
