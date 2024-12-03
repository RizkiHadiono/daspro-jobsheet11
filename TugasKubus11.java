import java.util.Scanner;

public class TugasKubus11 {

    static int hitungVolume(int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        return volume;
    }

    static int hitungLuasPermukaan(int rusuk) {
        int luas = 6 * (rusuk * rusuk);
        return luas;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang rusuk: ");
        int rusuk = sc.nextInt();

        int volume = hitungVolume(rusuk);
        System.out.println("\nVolume Kubus: " + volume);

        int luasPermukaan = hitungLuasPermukaan(rusuk);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
