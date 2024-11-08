import java.util.Scanner;
/*
Disini kita dapat mengunakan scanner(inputan dari user) & mengunkan method,kondisi,operator logika, validasi
 */
public class UseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {                               //Menangkap input yang tidak valid (non-angka) dan memberikan pesan error.
            System.out.print("Masukkan waktu dalam rentang 24 jam (0-24): ");
            int time = sc.nextInt();        //disini time(adalah inputan dari pengguna/kita cess!!)

            if (time >= 0 && time <= 24) { // kondisi harus diantara 0 - 24
                greet(time);                //memangil method great
            } else {
                System.out.println("Waktu yang dimasukkan harus antara 0 dan 24.");
            }
        } catch (Exception e) {     //jika kamu mengunaakn string atau selain dari int , maka akan menampilkan pesan yg ada dibawah ceskku
            System.out.println("Input tidak valid. Harap masukkan angka.");
        } finally {
            sc.close();     //kita gunakan sc.close untuk mengindari kebocoran data ygs
        }
    }

    public static void greet(int time) {        //ini methodnya braderrr!!
        if (time >= 5 && time < 12) {
            System.out.println("Selamat pagi, Abangku!");
        } else if (time >= 12 && time < 15) {
            System.out.println("Selamat siang, Ces!");
        } else if (time >= 15 && time < 18) {
            System.out.println("Selamat sore, Ketua!");
        } else if (time >= 18 && time <= 24 || time >= 0 && time < 5) {
            System.out.println("Selamat malam, Bosku!");
        } else {
            System.out.println("Tidak ada data kawan.");
        }
    }
}
