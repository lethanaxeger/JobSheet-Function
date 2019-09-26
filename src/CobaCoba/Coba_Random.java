package CobaCoba;

import java.util.Scanner;

public class Coba_Random {
    public static void Kata(String a, String b) {
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan kata pertama: ");
        String kata1 = input.nextLine();
        
        System.out.println("Masukkan kata kedua: ");
        String kata2 = input.nextLine();
        
        Kata(kata1, kata2);
    }
}
