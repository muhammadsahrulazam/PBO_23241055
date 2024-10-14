import java.util.Scanner;

public class Kalkulator {
    private Scanner scanner;

    // Constructor
    public Kalkulator() {
        scanner = new Scanner(System.in);
    }

    public void mulai() {
        int pilihan;
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Silahkan pilih menu berikut:");
            System.out.println("1. Perkalian");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pembagian");
            System.out.println("4. Pengurangan");
            System.out.print("Silahkan masukkan pilihan anda cok: ");
            pilihan = scanner.nextInt();

            double bilangan1, bilangan2, hasil = 0;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan 1: ");
                    bilangan1 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan 2: ");
                    bilangan2 = scanner.nextDouble();
                    hasil = bilangan1 * bilangan2;
                    System.out.println("Hasilnya: " + hasil);
                    break;

                case 2:
                    System.out.print("Masukkan bilangan 1: ");
                    bilangan1 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan 2: ");
                    bilangan2 = scanner.nextDouble();
                    hasil = bilangan1 + bilangan2;
                    System.out.println("Hasilnya: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan bilangan 1: ");
                    bilangan1 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan 2: ");
                    bilangan2 = scanner.nextDouble();
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                        System.out.println("Hasilnya: " + hasil);
                    } else {
                        System.out.println("Pembagian dengan nol tidak valid bodoh.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan bilangan 1: ");
                    bilangan1 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan 2: ");
                    bilangan2 = scanner.nextDouble();
                    hasil = bilangan1 - bilangan2;
                    System.out.println("Hasilnya: " + hasil);
                    break;

                default:
                    System.out.println("Pilihan anda tidak ada di menu bodoh.");
                    break;
            }

            System.out.print("Apakah ingin lanjut? (ya/tidak): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan kalkulator kami.");
        scanner.close();
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.mulai();
    }
}