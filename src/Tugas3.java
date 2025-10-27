import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Nilai harus berupa angka!");
            return;
        }
        int nilai = sc.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Error: Nilai harus antara 0 sampai 100.");
            return;
        }

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        System.out.println("Nama: " + nama + ", Status: " + status);
    }
}
