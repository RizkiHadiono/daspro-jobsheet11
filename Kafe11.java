public class Kafe11 {

        public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
            System.out.println("\nSelamat datang, " + namaPelanggan + "!");

            if (isMember) {
                System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            }

            // Kode Promo
            if (kodePromo.equals("DISKON50")) {
                System.out.println("Kode promo berlaku! Anda mendapatkan 50% untuk setiap pembelian.");
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Kode promo berlaku! Anda mendapatkan 30% untuk setiap pembelian.");
            } else {
                System.out.println("Kode promo invalid.");
            }

            System.out.println("\n===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System.out.println("===========================");
            System.out.println("Silahkan pilih menu yang Anda ingkinkan.");

        }
        public static void main(String[] args) {
            Menu("Andi", true, "DISKON50");
            Menu("ChinLee", true, "DISKON30");
            Menu("Rizki", true, "DISKON10");
        }
}
