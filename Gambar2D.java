import java.util.Scanner;

public class Gambar2D {

    private static void cetakPola(int baris, int kolom, String simbol) {
        System.out.println("Pola 2D:");
        System.out.println("=".repeat(kolom * 2));  // Tambahkan garis dekoratif

        for (int i = 0; i < baris; i++) {       //ini loop luar brader!
            for (int j = 0; j < kolom; j++) {   //ini loop dalam(yg mencetak simbol)
                System.out.print(simbol + " ");
            }
            System.out.println();//spasi
        }

        System.out.println("=".repeat(kolom * 2));  // Garis dekoratif di bagian akhir
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        System.out.print("Masukkan simbol yang ingin dicetak: ");
        String simbol = sc.next();

        cetakPola(baris, kolom, simbol);
    }
}
