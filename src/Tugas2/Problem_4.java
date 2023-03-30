package Tugas2;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println("Problem 4");

        Scanner input = new Scanner(System.in);

        String Mahasiswa, NilaiAlgo, NilaiLogika;
        Boolean SyaratAlgo, SyaratLogika;

        System.out.println("Masukkan nama Mahasiswa :");
        Mahasiswa = input.nextLine();

        System.out.println("Masukkan nilai algoritma :");
        NilaiAlgo = input.nextLine();

        SyaratAlgo = NilaiAlgo.equals("A,") || NilaiAlgo.equals("B")||NilaiAlgo.equals("C");

        System.out.println("Masukkan nilai Logika : ");
        NilaiLogika = input.nextLine();

        SyaratLogika = NilaiLogika.equals("A") || NilaiLogika.equals("B")||NilaiLogika.equals("C");

        System.out.println(Mahasiswa);

        if (SyaratAlgo && SyaratLogika) {
            System.out.println("Mahasasiwa (" + Mahasiswa + ") boleh mengambil matkul struktur data");
        } else {
            System.out.println("Mahasiswa (" + Mahasiswa + ") tidak bisa mengambil matkul struktur data");
        }

    }
}
 
    

