package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Create the variable and scanner
        boolean running = true;
        int counter     = 0;
        String answer;
        Scanner scan    = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]>");

            answer      = scan.nextLine();

            // Check the answer, If yes then loop stopped
            if (answer.equalsIgnoreCase("ya")) {
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }
}
