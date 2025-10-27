import java.util.Scanner;

public class IterasiSederhana {
    // Fungsi g(x) dari bentuk x = g(x)
    static double g(double x) {
        return Math.sqrt((10 - x * x * x) / 4);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tebakan awal (x0): ");
        double x0 = input.nextDouble();

        double toleransi = 0.0001;
        int maksIterasi = 50;
        double x1;
        int iterasi = 0;

        System.out.println("\nIterasi\t\tx\t\tg(x)\t\t|x1 - x0|");
        do {
            x1 = g(x0);
            double error = Math.abs(x1 - x0);
            System.out.printf("%d\t\t%.6f\t%.6f\t%.6f\n", iterasi + 1, x0, x1, error);

            x0 = x1;
            iterasi++;

            if (error < toleransi) break;
        } while (iterasi < maksIterasi);

        System.out.println("\nAkar hampiran = " + x1);
        System.out.println("Jumlah iterasi = " + iterasi);
    }
}
