import java.util.Scanner;

public class Pemilihan2Percobaan117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        int cekKelipatan4 = tahun % 4;
        int cekKelipatan100 = tahun % 100;
        int cekKelipatan400 = tahun % 400;
        int kabisat = (1 - (cekKelipatan4 / (cekKelipatan4 + 1))) * (1 - (cekKelipatan100 / (cekKelipatan100 + 1))) * (1 - (cekKelipatan400 / (cekKelipatan400 + 1)));

        if (kabisat == 1) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " Bukan tahun kabisat");
        }
    }
}
