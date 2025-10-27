import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah angka harus lebih dari 0.");
            return;
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            if (!sc.hasNextDouble()) {
                System.out.println("Input tidak valid! Harus berupa angka.");
                return;
            }
            double num = sc.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Rata-rata: " + average);
    }
}
