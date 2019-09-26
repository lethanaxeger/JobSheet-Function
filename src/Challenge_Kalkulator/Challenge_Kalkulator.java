package Challenge_Kalkulator;

import java.util.Scanner;

public class Challenge_Kalkulator {
    
    public static int penjumlahan (int a, int b) {
        System.out.println("\nHasil jumlah " + a + " + " + b + " adalah : " + (a + b));
        return 0;
    }
    
    public static int pengurangan (int c, int d) {
        System.out.println("\nHasil pengurangan " + c + " - " + d + " adalah : " + (c - d));
        return 0;
    }
    
    public static int perkalian (int e, int f) {
        System.out.println("\nHasil perkalian " + e + " * " + f + " adalah : " + (e * f));
        return 0;
    }
    
    public static double pembagian (double g, double h) {
        System.out.println("\nHasil pembagian " + g + " / " + h + " adalah : " + (g / h));
        return 0;
    }
    
    public static double sisa (double i, double j) {
        if (i > j) {
            System.out.println("Hasil Tidak Ditemukan!");
        } else {
            System.out.println("\nHasil sisa pembagian adalah : " + i + " % " + j + " adalah : " + (i % j));
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=-=Penjumlahan=-=");
        System.out.print("\nBilangan pertama : ");
        int a = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int b = input.nextInt();
        
        penjumlahan (a, b);
        
        System.out.println("\n=-=Pengurangan=-=");
        System.out.print("\nBilangan pertama : ");
        int c = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int d = input.nextInt();
        
        pengurangan (c, d);
        
        System.out.println("\n=-=Perkalian=-=");
        System.out.print("\nBilangan pertama : ");
        int e = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int f = input.nextInt();
        
        perkalian (e, f);
        
        System.out.println("\n=-=Pembagian=-=");
        System.out.print("\nBilangan pertama : ");
        int g = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int h = input.nextInt();
        
        pembagian(g, h);
        
        System.out.println("\n=-=Sisa Bagi=-=");
        System.out.print("\nBilangan pertama : ");
        int i = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int j = input.nextInt();
        
        sisa(g, h);
    }
}
