import java.util.Scanner;

public class Pemilihan2Percobaan217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("============ MENU KAFE JTI ===========");
        System.out.println("--------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari Menu yang dipilih = ");
        int pilihan_menu = input.nextInt();
        input.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = input.nextLine();
        System.out.println("--------------------------------------");

        // Jika memiliki member
        double diskon = 0.0;
        int harga = 0;
        double total_bayar;
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            // Menghitung total tanpa member
            total_bayar = harga;
        } else {
            System.out.println("Member tidak valid!");
            return;
        }

        // Menanyakan metode pembayaran
        System.out.print("Metode pembayaran (Cash/QRIS)? = ");
        String metode_pembayaran = input.nextLine();
        System.out.println("--------------------------------------");

        // Memberikan potongan Rp. 1.000 jika menggunakan QRIS
        if (metode_pembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= 1000; // Mengurangi total dengan potongan
            System.out.println("Potongan QRIS = Rp. 1000");
        }

        // Menampilkan total akhir
        System.out.println("Total bayar akhir = " + total_bayar);
        System.out.println("--------------------------------------");
    }
}
