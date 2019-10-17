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
public class BesarKecil {
    Scanner scan = new Scanner(System.in);

    int jmlMhs;
    int nilai[] = new int[99];
    double max, min;

    public void input(int jmlMhs) {

        for (int i = 0; i <= (jmlMhs - 1); i++) {

            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilai[i] = scan.nextInt();

        }

    }

    public void tampil(int jmlMhs) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
        }
    }

    public void tentuBesarKecil(int jmlMhs) {
        int i = 0;
        max = nilai[i];
        min = nilai[i];
        for (i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilai[i]);
            
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}
