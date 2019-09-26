package Latihan;

import java.util.Scanner;

public class Latihan_4 {
    
    public static int hitung(int a, int b) {
        System.out.println("Kecepatan : " + a / b + " Km/Jam");
        return 0;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jarak : ");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan waktu tempuh : ");
        int waktu = input.nextInt();
        
        hitung(jarak, waktu);
    }
}
