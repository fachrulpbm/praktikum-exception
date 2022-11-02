import java.util.Scanner;

class Pembagian{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pembilang = 0.0;

        try {
            System.out.println("Masukkan nilai pembilang: ");
            pembilang = scanner.nextDouble();

            System.out.println("Masukkan nilai penyebut: ");
            double penyebut = scanner.nextDouble();

            double hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian = " + hasil);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world!");

    }

}