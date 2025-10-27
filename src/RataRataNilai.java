import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Masukkan jumlah nilai: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Error: Jumlah nilai harus lebih dari 0!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            double nilai = input.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Peringatan: Nilai " + nilai +
                        " di luar rentang 0-100, tetap dihitung!");
            }

            sum += nilai;
        }

        double rata2 = sum / n;
        System.out.println("Rata-rata nilai = " + rata2);

        input.close();
    }
}
