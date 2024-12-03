import java.util.Scanner;

public class Tugas2 {
    
    static Scanner sc = new Scanner(System.in);

    public static void inputDataPenjualan(String[] menu, int[][] dataPenjualan) {
        System.out.println("Masukkan data penjualan : ");

        for (int i = 0; i < menu.length; i++) {  // Loop untuk menu
            System.out.println((i+1) + "." + menu[i] + " : ");  // Langgil nama menu

            for (int j = 0; j < 7; j++) {  // Loop untuk hari
                System.out.print("Hari ke-" + (j+1) + " : ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan seluruh data
    public static void tampilDataPenjuanal(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nData Penjualan : ");

        System.out.print("               "); 
        for (int i = 0; i < 7; i++) {  // Loop untuk setiap hari
            System.out.printf("%-15s", "Hari " + (i + 1));
        }
        System.out.println();

        // Tabel data penjualan
        for (int i = 0; i < menu.length; i++) {  // Loop untuk setiap menu
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {  // Loop untuk setiap hari
                System.out.printf("%-15d", dataPenjualan[i][j]); // Menampilkan jumlah penjualan
            }
            System.out.println();
        }
    }

    // fungsi untuk mencari menu dengan penjualan tertinggi
    public static void cariPenjualanTertinggi(String[] menu, int[][] dataPenjualan) {

        // Nilai awal dari penjualan
        int maxPenjualan = 0;
        String menuTertinggi = "";

        // Cari menu yg penjualan tertinggi
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;

            // Hitung total penjualan menu ke i
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }

            // Pembaruan menu tertinggi
            if (totalPenjualan >= maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi : " + menuTertinggi);
        System.out.println("dengan total penjualan : " + maxPenjualan);
    }

    // Fungsi untuk hitung rata-rata penjualan tiap menu
    public static void hitungRataTiapMenu(String[] menu, int[][] dataPenjualan) {
        System.out.println("\nRata-rata Penjualan Tiap Menu : ");

        for (int i = 0; i < menu.length; i++) {  // Loop untuk setiap menu
            int totalPenjualan = 0;

            // Hitung total penjualan menu ke i
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }

            // Hitung rata2
            double rata = totalPenjualan / 7;

            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }

    public static void main(String[] args) {

        // Array menu
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        // Array data penjualan
        int[][] dataPenjualan = new int[5][7]; //5 menu 7 hari

        // Panggil fungsi input data
        inputDataPenjualan(menu, dataPenjualan);

        // Panggil fungsi tampil data
        tampilDataPenjuanal(menu, dataPenjualan);

        // Panggil fungsi untuk tampil menu dengan penjualan tertinggi
        cariPenjualanTertinggi(menu, dataPenjualan);

        // Panggil fungsi untuk tampil rata-rata penjualan setiap menu
        hitungRataTiapMenu(menu, dataPenjualan);
    }
}
