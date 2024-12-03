public class PengunjungCafe11 {
    public static void daftarPengunjung (String... namaPengunjung) {
        System.out.println("Daftar nama Pengunjung:");

        // Menggunakan for-each Loop
        for (String pengunjung : namaPengunjung) {
            System.out.println("- "+ pengunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");   
    }
}
