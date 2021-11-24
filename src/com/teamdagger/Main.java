package com.teamdagger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String kelas = "Basic Programming";

        intro(kelas);

        ArrayList<String> namaLengkap = new ArrayList<>();
        ArrayList<Integer> umur = new ArrayList<>();

        namaLengkap.add("John Foley");
        umur.add(19);

        namaLengkap.add("John Wick");
        umur.add(20);

        namaLengkap.add("Dominick");
        umur.add(20);

        tampilkanManual(namaLengkap,umur);

        System.out.println("--------------------------------");

        tampilkanAutomatis(namaLengkap,umur);

        int panjang = 10;
        int lebar = 5;

        int hasil = hitungLuasPersegiPanjang(panjang,lebar);

        System.out.println( "Hasil Luas = "+ hasil );

    }

    public static int hitungLuasPersegiPanjang(int panjang,int lebar){
        int luas = panjang * lebar;

        return luas;
    }

    public static void intro(String kelasKomandro)
    {
        System.out.println("Halo, selamat datang di Kelas " + kelasKomandro);
    }

    public static void tampilkanManual(ArrayList<String> namaLengkap, ArrayList<Integer> umur)
    {
        System.out.println( "Nama : " + namaLengkap.get(0) );
        System.out.println( "Umur : " + umur.get(0) );

        System.out.println( "Nama : " + namaLengkap.get(1) );
        System.out.println( "Umur : " + umur.get(1) );

        System.out.println( "Nama : " + namaLengkap.get(2) );
        System.out.println( "Umur : " + umur.get(2) );
    }

    public static void tampilkanAutomatis(ArrayList<String> namaLengkap, ArrayList<Integer> umur){
        for( int urutan = 0 ; urutan < 3 ; urutan++ )
        {
            System.out.println("Urutan ke " + urutan);
            System.out.println("Nama : " + namaLengkap.get(urutan ));
            System.out.println("Umur : " + umur.get(urutan) );
        }

        System.out.println("Perulangan selesai");
    }

}
