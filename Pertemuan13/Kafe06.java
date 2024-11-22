package Pertemuan13;

import java.util.Scanner;

public class Kafe06 {
    public static void main(String[] args) {
        String kodePromo = "DISKON50";
        Menu("Andi", true, kodePromo);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Kode promo diterima! Anda mendapatkan diskon 50%.");
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Kode promo diterima! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if ("DISKON50".equals(kodePromo)) {
            hargaTotal *= 0.5;
        } else if ("DISKON30".equals(kodePromo)) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
        }

        return hargaTotal;
    }
}
