package Latihan;

import java.util.Scanner;

public class Latihan_5 {
    public static int bilangan(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("\nNilai terbesar Adalah : " + a);
        } else if (b > a && b > c) {
            System.out.println("\nNilai terbesar Adalah : " + b);
        } else if (c > a && c > b) {
            System.out.println("\nnilai terbesar adalah : " + c);
        }
        return 0;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan I : ");
        int a = input.nextInt();
        
        System.out.print("Masukkan bilangan II : ");
        int b = input.nextInt();
        
        System.out.print("Masukkan bilangan III : ");
        int c = input.nextInt();
        
        bilangan(a, b, c);
    }
}
