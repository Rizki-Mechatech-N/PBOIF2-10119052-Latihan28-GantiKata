package pboif2.pkg10119052.latihan28.gantikata;
import java.util.Scanner;


/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * perubahan string dengan metode string replace
 * 
 */
public class PBOIF210119052Latihan28GantiKata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String teks,cari,ganti;
        System.out.println("====Program Mengganti Kata===");
        System.out.println("Masukan Kalimat : ");
        teks = in.nextLine();
        System.out.println("Ganti Kata : ");
        cari = in.nextLine();
        System.out.println("Menjadi Kata : ");
        ganti = in.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : "+teks);
        System.out.println("Kalimat baru : "+teks.replace(cari, ganti));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha");
    }
    
}
