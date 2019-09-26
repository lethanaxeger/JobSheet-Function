package method;

import java.util.Scanner;

public class Method {

    static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
    }
    
    public static void main(String[] args) {
        int sisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        sisi = input.nextInt();
        System.out.println("Luas Persegi dengan panjang sisi " + sisi + " adalah " + luasPersegi(sisi));
    }
}
