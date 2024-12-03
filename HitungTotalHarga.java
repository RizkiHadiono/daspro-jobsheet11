import java.util.Scanner;

public class HitungTotalHarga {

    public static int hitungHargaPerItem(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
            System.out.println("Kode promo DISKON50 berlaku! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
            System.out.println("Kode promo DISKON30 berlaku! Anda mendapatkan diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalHargaKeseluruhan = 0;
        boolean lanjutPesanan = true;

        System.out.println("Daftar menu:");
        System.out.println("1. Ayam Geprek  - Rp15,000");
        System.out.println("2. Mie Goreng   - Rp20,000");
        System.out.println("3. Mie Kuah     - Rp22,000");
        System.out.println("4. Ayam Bakar   - Rp12,000");
        System.out.println("5. Nasi Goreng  - Rp10,000");
        System.out.println("6. Matcha Latte - Rp18,000");

        while (lanjutPesanan) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo (jika ada): ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungHargaPerItem(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;

            System.out.println("Total harga untuk menu ini: Rp" + totalHarga);

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("n")) {
                lanjutPesanan = false;
            }
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalHargaKeseluruhan);
    }
}
