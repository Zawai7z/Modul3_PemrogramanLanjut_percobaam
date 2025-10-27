import java.util.ArrayList;
import java.util.Scanner;

class Peserta {
    private String nama;
    private int umur;
    private String cabangLomba;

    public Peserta(String nama, int umur, String cabangLomba) {
        this.nama = nama;
        this.umur = umur;
        this.cabangLomba = cabangLomba;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getCabangLomba() { return cabangLomba; }

    public void tampilkanInfo() {
        System.out.println(nama + " - " + umur + " tahun - " + cabangLomba);
    }
}

class LombaManager {
    private ArrayList<Peserta> daftarPeserta = new ArrayList<>();

    public void tambahPeserta(Peserta peserta) {
        daftarPeserta.add(peserta);
        System.out.println("✅ Peserta berhasil ditambahkan!");
    }

    public void tampilkanPeserta() {
        if (daftarPeserta.isEmpty()) {
            System.out.println("Belum ada peserta yang terdaftar.");
            return;
        }
        System.out.println("\n=== Daftar Peserta Lomba ===");
        int nomor = 1;
        for (Peserta p : daftarPeserta) {
            System.out.print(nomor++ + ". ");
            p.tampilkanInfo();
        }
    }
}

public class LombaSetelah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LombaManager manager = new LombaManager();
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pengelolaan Peserta Lomba ===");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Tampilkan Peserta");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // biar buffer aman

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nama peserta: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan umur peserta: ");
                    int umur = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan cabang lomba: ");
                    String cabang = input.nextLine();
                    manager.tambahPeserta(new Peserta(nama, umur, cabang));
                }
                case 2 -> manager.tampilkanPeserta();
                case 3 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}
