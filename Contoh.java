import java.util.Scanner;

public class Contoh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nilai pembilang: ");
            int pembilang = scanner.nextInt();
            System.out.print("Nilai penyebut: ");
            int penyebut = scanner.nextInt();
            int hasil = pembilang/penyebut;
            System.out.println(hasil); // aritmatik
            // -------------------------------------------------
            System.out.print("Masukkan jumlah looping: ");
            int loop = scanner.nextInt(); // 3
            int[] angka = new int[loop];
            for (int i = 0; i < loop; i++) {
                System.out.print("Nilai ke-" + i + ": ");
                int nilai = scanner.nextInt(); // 75, 76, 77
                angka[i] = nilai;
            }
            System.out.print("Akses index ke berapa: ");
            int index = scanner.nextInt(); // 3
            System.out.println(angka[index]); // indexoutofbounds
        } catch (ArithmeticException e) {
            System.out.println("Terdapat kesalahan aritmatik, periksa kembali perhitungan Anda");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Periksa kembali pemanggilan index");
        }
        System.out.println("Hello world!");
    }
    
}
