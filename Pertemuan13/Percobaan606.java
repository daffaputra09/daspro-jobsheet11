package Pertemuan13;
import java.util.Scanner;

public class Percobaan606 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p = input.nextInt();
        System.out.println("Masukkan Lebar");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah "+L);

        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah "+vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a,b)*tinggi;
        return volume;
    }
}
