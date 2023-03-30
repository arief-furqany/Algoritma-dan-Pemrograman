package Praktikum;

public class Pertemuan1 {

    public static void main(String[] args) {
    
    System.out.println("Menghitung luas balok"); 
    System.out.println("");
    System.out.println("rumus luas balok adalah 'panjang x lebar x tinggi'");

    double panjang, lebar, tinggi, luas;

    // Deklarai nilai variable
    panjang = 7.5;
    lebar = 2.2;
    tinggi = 4;

    //operasi luas
    luas = panjang * lebar * tinggi;

    System.out.println("panjang = " + panjang +" * lebar = " + lebar + " * tinggi = " + tinggi );
    System.out.println(luas);
   }
    
}
