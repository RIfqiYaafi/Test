import java.util.Scanner;

public class LiveTemplate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penambahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih! Keluar dari program.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double num1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double num2 = input.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Pembagian oleh nol.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            System.out.println("Hasil: " + result);
        }

        input.close();
    }
}