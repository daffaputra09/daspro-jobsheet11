package Pertemuan13;

import java.util.Scanner;

public class Kubus06 {
    public static void main(String[] args) {
        int sisi, volume, luasPermukaan;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Sisi: ");
        sisi = input.nextInt();

        volume = volumeKubus(sisi);
        luasPermukaan = luasPermukaanKubus(sisi);

        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }

    static int volumeKubus(int s) {
        int volume = s * s * s;
        return volume;
    }

    static int luasPermukaanKubus(int s) {
        int luas = 6 * (s * s);
        return luas;
    }
}
