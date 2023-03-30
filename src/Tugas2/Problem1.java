package Tugas2;
import java.util.Scanner;

public class Problem1{



    public static void main(String[] args) {

    Scanner masbro = new Scanner(System.in);
        System.out.println("Menghitung Komisi Karyawan");


        // problem
        // Buatlah algoritma untuk mengjitung komisi yang diterima salesman berdasarkan hasil penjualan
        // yang dicapainya, salesman itu mendapat 15% komisi dari hasil penjualannya. Masukkan bagi algoritma
        // adalah nama salesman dan nilai penjualan yang dicapainya. tampilkan piranti keluaran nama salesman,
        // nilai penjualan yang dicapai dan komisi yang didapat.

        String NamaKaryawan;
        int Total_Penjualan, Komisi;

        System.out.println("Masukkan Nama Karyawan : ");
        NamaKaryawan = masbro.nextLine();

        System.out.println("Masukkan penjualan total");
        Total_Penjualan = masbro.nextInt();

        Komisi = Total_Penjualan*15/100;
        System.out.println("Nama Karyawan: " + NamaKaryawan);
        System.out.println("Total Penjualan: " + Total_Penjualan);
        System.out.println("Total Komisi: "+ Komisi);






    
}
}