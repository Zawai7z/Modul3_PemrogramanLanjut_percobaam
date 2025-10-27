import java.util.Scanner;

public class LombaSebelum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[100];
        int[] umur = new int[100];
        String[] lomba = new String[100];
        int jumlah = 0;
        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("\n=== Sistem Pengelolaan Peserta Lomba ===");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Tampilkan Peserta");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nama peserta: ");
                nama[jumlah] = input.next();
                System.out.print("Masukkan umur peserta: ");
                umur[jumlah] = input.nextInt();
                System.out.print("Masukkan cabang lomba: ");
                lomba[jumlah] = input.next();
                jumlah++;
                System.out.println("Peserta berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.println("\n=== Daftar Peserta Lomba ===");
                for (int i = 0; i < jumlah; i++) {
                    System.out.println((i + 1) + ". " + nama[i] + " - " + umur[i] + " tahun - " + lomba[i]);
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
