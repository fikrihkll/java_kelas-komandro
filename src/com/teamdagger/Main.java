package com.teamdagger;

public class Main {

    public static void main(String[] args) {

        // Ketik disini
        System.out.println("Hello kelas komandro");
        System.out.println("Kelas Basic Programming");

        String namaLengkap = "John Foley";
        System.out.println("Nama lengkapnya adalah " + namaLengkap);

        int umur = 15 ;
        System.out.println("Umurnya adalah " + umur );

        double nilai = 18.5;
        System.out.println("Nilainya adalah " + nilai);

        boolean apakahWni = true;
        System.out.println("Apakah " + namaLengkap + " WNI ?" + apakahWni);


        if(umur >= 16){
            System.out.println("Selamat, anda bisa ikut vaksin. Silahkan masuk antrian");
        }else{
            System.out.println("Mohon maaf, anda tidak bisa ikut vaksin");
        }

        if(nilai >= 90){
            System.out.println("Nilai kamu Sangat Bagus");
        }else if(nilai >= 80){
            System.out.println("Nilai kamu Bagus");
        }else if(nilai >= 70){
            System.out.println("Nilai kamu Cukup");
        }else if(nilai == 1){
            System.out.println("Kamu sepertinya tidak belajar");
        }else{
            System.out.println("Kamu harus mengulang");
        }



        if(namaLengkap.equals("John Foley") ){
            System.out.println("Kamu dapat fasilitas khusus");
        }else{
            System.out.println("Kamu dapat fasilitas biasa");
        }

        if(apakahWni == true){
            System.out.println("Kamu adalah Rakyat Indonesia");
        }else{
            System.out.println("Kamu adalah Rakyat Asing");
        }


    }
}
