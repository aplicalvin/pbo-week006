package week006;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String inputan;

        // PESAN PEMBUKA
        System.out.println("-------------------------------------------");
        System.out.println("> Selamat datang di Game tebak Palindrome |");
        System.out.println("-------------------------------------------");
        System.out.println("\nNb. Palindrome adalah kata, frasa, angka, atau rangkaian simbol yang dibaca sama dari depan dan belakang.");
        System.out.println("Contoh palindrom adalah kodok, radar, taat, madam, racecar, dan 22/02/2022\n");

        // INISIALISASI
        TextGame game = new FancyTextGame();
        boolean lanjutin = true;

        // LOOP UTAMA
        do {
            // Input kata
            System.out.print("\nMasukkan Kata : ");
            inputan = masukan.nextLine();  
            game.displayResult(inputan);

            // Validasi lanjut
            System.out.print("\nLanjut? (Y/T) : ");
            char isLanjut = masukan.nextLine().charAt(0);

            if (isLanjut == 'Y' || isLanjut == 'y') {
                lanjutin = true;
            } else {
                lanjutin = false;
            }
        } while (lanjutin);

        System.out.println("\nTerimakasih telah menggunakan program ini!");
    }
}