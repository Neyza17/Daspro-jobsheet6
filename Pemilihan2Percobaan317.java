import java.util.Scanner;

public class Pemilihan2Percobaan317 {
    public static void main(String[]args) {
        Scanner no17 = new Scanner(System.in);     
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori (Pebisnis/Pekerja): ");
        kategori = no17.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan: ");
        penghasilan = no17.nextInt();
        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih: " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih: " + gajiBersih);
        } else 
        System.out.println("Masukkan Kategori Salah");
    } 
}
