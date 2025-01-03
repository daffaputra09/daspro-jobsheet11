package Pertemuan13;

import java.util.Scanner;

public class PenjualanCafe {
    private static int JUMLAH_HARI;
    private static int MENU;
    private static String[] jenisMenu;
    private static int[][] dataPenjualan;
    
    
    public static void main(String[] args) {
        menentukanData();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Program Cafe ===");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Semua Data Penjualan");
            System.out.println("3. Tampilkan Menu Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                inputDataPenjualan();
                break;
                case 2:
                tampilkanSeluruhPenjualan();
                break;
                case 3:
                tampilkanPenjualanTertinggi();
                break;
                case 4:
                tampilkanRataRataPenjualan();
                break;
                case 0:
                System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
    
    public static void menentukanData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hari: ");
        JUMLAH_HARI = scanner.nextInt();
        
        System.out.print("Masukkan jumlah menu: ");
        MENU = scanner.nextInt();
        scanner.nextLine(); 
        
        jenisMenu = new String[MENU];
        dataPenjualan = new int[MENU][JUMLAH_HARI];
        
        System.out.println("\nMasukkan nama-nama menu:");
        for (int i = 0; i < MENU; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            jenisMenu[i] = scanner.nextLine();
        }
    }
    
    public static void inputDataPenjualan() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < MENU; i++) {
            System.out.println("\nInput data untuk " + jenisMenu[i] + ":");
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Data penjualan berhasil diinput!");
    }
    
    public static void tampilkanSeluruhPenjualan() {
        System.out.println("\n=== Data Penjualan Cafe ===");
        System.out.printf("%-12s", "Menu");
        for (int i = 1; i <= JUMLAH_HARI; i++) {
            System.out.printf("%-10s", "Hari " + i);
        }
        System.out.println();
        
        for (int i = 0; i < MENU; i++) {
            System.out.printf("%-12s", jenisMenu[i]);
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.printf("%-10d", dataPenjualan[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void tampilkanPenjualanTertinggi() {
        int[] totalPenjualan = new int[MENU];
        int penjualanTertinggi = 0;
        int maxIndex = 0;
        
        for (int i = 0; i < MENU; i++) {
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalPenjualan[i] += dataPenjualan[i][j];
            }
            if (totalPenjualan[i] > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan[i];
                maxIndex = i;
            }
        }
        
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        System.out.println("Menu: " + jenisMenu[maxIndex]);
        System.out.println("Total Penjualan: " + penjualanTertinggi + " porsi");
    }
    
    public static void tampilkanRataRataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        
        for (int i = 0; i < MENU; i++) {
            int total = 0;
            for (int j = 0; j < JUMLAH_HARI; j++) {
                total += dataPenjualan[i][j];
            }
            double average = (double) total / JUMLAH_HARI;
            System.out.printf("%s: %.2f porsi per hari%n", jenisMenu[i], average);
        }
    }
}