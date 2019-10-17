/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan39.terbesarterkecil;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BesarKecil nilai = new BesarKecil();
        String Petugas;
        int jmlMhs;

        Scanner scan = new Scanner(System.in);

        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas\t\t\t: ");
        Petugas = scan.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t: ");
        jmlMhs = scan.nextInt();
        System.out.println();
        
        nilai.input(jmlMhs);
        System.out.println();
        nilai.tampil(jmlMhs);
        
        nilai.tentuBesarKecil(jmlMhs);
        
        System.out.printf("%nNilai terbesar adalah : %.1f%n",nilai.max);
        System.out.printf("Nilai terkecil adalah : %.1f%n",nilai.min);
        System.out.printf("%nPetugas\t: %s%n",Petugas);
    }
    
}
