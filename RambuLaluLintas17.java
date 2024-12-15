import java.util.Scanner;

public class RambuLaluLintas17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kondisiLampu;
        
        System.out.println("==== SISTEM RAMBU LALU LINTAS ====");
        System.out.println("Kondisi lampu tersedia: MERAH, KUNING, dan HIJAU");
        
        System.out.print("Masukkan kondisi lampu (MERAH/KUNING/HIJAU): ");
        kondisiLampu = input.nextLine();
        if (kondisiLampu.equalsIgnoreCase("MERAH")) {
            System.out.println("BERHENTI!");
        } 
        else if (kondisiLampu.equalsIgnoreCase("KUNING")) {
            System.out.println("KURANGI KECEPATAN DAN BERHENTI!");
        } 
        else if (kondisiLampu.equalsIgnoreCase("HIJAU")) {
            System.out.println("LANJUTKAN PERJALANAN!");
        } 
        else {
            System.out.println("Kondisi lampu yang dimasukkan tidak valid.");
        }
        
        System.out.println("=== SISTEM SELESAI ===");
    }
}
