package Tugas2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner masbro = new Scanner(System.in);

        System.out.println("Problem 3");


        int i, j;
        int ganjil_genap;

        System.out.println("masukkan nilai");
        ganjil_genap = masbro.nextInt();

        if (ganjil_genap%2 == 0); {
            for (i = 1; j <= ganjil_genap; i++){
                for(j = 1; j <= ganjil_genap; j++) {
                    System.out.println(" * ");
                }
            System.out.println("");
            }
        } //else error
         {
            for ( i = 1; j <= ganjil_genap; j++){
                for (j = 1; j <= i; j++){
                    System.out.println(" * ");
                }
                System.out.println("");
            }


        }
    }
}
