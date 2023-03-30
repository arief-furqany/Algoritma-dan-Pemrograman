import java.util.Scanner;

public class Problem2{

    public static void main(String[] args) {
        
        java.util.Scanner input = new Scanner (System.in);
        System.out.println("Menghitung Gaji Bersih Karyawan");

        String Nama_karyawan;
        int GajiPokok, Tunjangan, Pajak, GajiBersih;

        System.out.println("Nama Karyawan :");
        Nama_karyawan = input.nextLine();

        System.out.println("Gaji pokok: ");
        GajiPokok = input.nextInt();

        Tunjangan = GajiPokok * 15/100;
        Pajak = ((GajiPokok + Tunjangan) * 15/100);
        GajiBersih = GajiPokok + Tunjangan - Pajak;

        System.out.println("Nama Karyawan : " + Nama_karyawan);
        System.out.println("Gaji Bersih : " + GajiBersih);





    }
}