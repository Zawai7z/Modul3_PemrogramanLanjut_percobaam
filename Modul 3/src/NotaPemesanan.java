import java.util.Scanner;

/**
 * Program Nota Pemesanan Makanan
 * Aplikasi sederhana untuk mencatat pesanan pelanggan restoran.
 * @author Marza
 * @version 1.0
 */
public class NotaPemesanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu
        String[] menu = {"Nasi Goreng", "Mie Ayam", "Ayam Geprek", "Sate Ayam"};
        double[] harga = {15000, 12000, 18000, 20000};

        System.out.println("=== Selamat Datang di Restoran Lezat ===");
        System.out.print("Masukkan nama pembeli: ");
        String nama = input.nextLine();

        System.out.println("\nMenu Makanan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nPilih nomor menu: ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        double total = hitungTotal(harga[pilihan - 1], jumlah);

        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Nama Pembeli   : " + nama);
        System.out.println("Menu Dipesan   : " + menu[pilihan - 1]);
        System.out.println("Harga Satuan   : Rp" + harga[pilihan - 1]);
        System.out.println("Jumlah Pesanan : " + jumlah);
        System.out.println("Total Bayar    : Rp" + total);
        System.out.println("===========================");
        System.out.println("Terima kasih telah memesan di Restoran Lezat!");
    }

    /**
     * Menghitung total harga berdasarkan harga satuan dan jumlah pesanan.
     * @param hargaSatuan harga per item
     * @param jumlah banyaknya pesanan
     * @return total harga
     */
    public static double hitungTotal(double hargaSatuan, int jumlah) {
        return hargaSatuan * jumlah;
    }
}
