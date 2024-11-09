
import java.util.Scanner;

public class CnthRekursif {
    /*Rekursif adalah teknik dalam pemrograman di mana suatu fungsi/metthod
     memanggil dirinya sendiri untuk menyelesaikan sebuah masalah, rekursif sangat efisien untuk masalah yang terstruktur
     secara hierarki atau berulang,  tetapi jika tidak hati2 juga bisa menyebabkan penggunaan memori yang tinggi.
     */
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

            //faktorial
        System.out.print("Masukan angka bro = ");
        int angka = inputanUser.nextInt();
        int hasil = contohRekursif(angka);  //kita memanggil fungsi dgn (angka atau inputan user)
        System.out.print("faktorial dari " + angka + " = " + hasil);
        System.out.println("\n");

            //fibonance
        System.out.print("masukan angka ces = ");
        int n = inputanUser.nextInt();
        System.out.println("Fibonacci ke-" + n + " adalah: " + fibonacci(n));
        System.out.println("\n");

           //pangkat
        System.out.print("Masukan angka: ");
        int base = inputanUser.nextInt();

        System.out.print("Pangkat berapa: ");
        int eksponen = inputanUser.nextInt();

        int hasildari = pangkat(base, eksponen);
        System.out.println("Hasil: " + hasildari);
        System.out.println("\n");

            //pembalik
        System.out.print("Masukan kalimat = ");
        String balik = inputanUser.next();
        System.out.println("kebalikan dari " + balik + " adalah " + balikString(balik));
        System.out.println("\n");

            //menghitung jumlah bilangan abangku
        System.out.print("masukan angka bebas  = ");
        int digit = inputanUser.nextInt();
        System.out.println("jumalah digit dari " + digit + " = " + hitung(digit));

    }



    //Mencari Faktorial, contoh faktorial 5 = 120 faktorial yaitu( 5*4*3*2*1)
    public static int contohRekursif(int parameter) {
        if (parameter <= 1) {
            return 1; // fungsi akan mengembalikan nilai 1 tanpa memanggil dirinya sendiri lagi.
        }
        return parameter * contohRekursif(parameter - 1);


        /*Mencari Fibonacci adalah deret angka di mana setiap angka merupakan jumlah dari dua angka sebelumnya.
         Misalnya, 0, 1, 1, 2, 3, 5, 8, 13
         ctt : indeks selalu dimulai dari 0
        */
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); //rumus mencari fibonacci F(n)=F(n−1)+F(n−2)
    }



    //Bilangan berpangkat
    public static int pangkat(int base, int exponent) {
        if (exponent == 0) {
            return 1;  // kondisi dasar: setiap angka pangkat 0 adalah 1
        }
        return base * pangkat(base, exponent - 1);

    }

    //pembalikan String contoh (halo = olah)
    public static String balikString(String balik){
        if (balik.isEmpty()){
            return balik;   // kondisi dasar: jika string kosong, langsung dikembalikan
        }
        return balikString(balik.substring(1)) + balik.charAt(0);

    }
    //Menghitung Jumlah digit
    public static int hitung(int digit){
        if (digit == 0){
            return 0;
        }
            return 1 + hitung(digit / 10);
    }


}
