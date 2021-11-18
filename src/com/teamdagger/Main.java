package com.teamdagger;

public class Main {

    public static void main(String[] args) {

        // ketik disini
        System.out.println("Hello, disini kelas komandro");
        System.out.println("Kita belajar basic programming");

        String namaLengkap = "John Foley";
        System.out.println("Nama lengkapnya adalah " + namaLengkap);

        int umur = 19;
        System.out.println("Umurnya adalah " + umur);

        double nilai = 1.0;
        System.out.println("Nilainya adalah " + nilai);

        boolean apakahWni = true;
        System.out.println("Apakah " + namaLengkap + " WNI ?" + apakahWni);

        System.out.println("");

        if( umur >= 20 ){
            System.out.println("Selamat anda bisa melakukan vaksin booster");
        } else{
            System.out.println("Maaf, umur anda belum mencukupi");
        }

        System.out.println("");

        if( nilai >= 90 ){
            System.out.println("Selamat Kamu Lulus");
        }else if( nilai >= 70 ){
            System.out.println("Kamu harus mengulang");
        }else if(nilai == 1){
            System.out.println("Kamu sudah berusaha, tapi tetap harus ikut kelas tambahan");
        }else{
            System.out.println("Kamu harus ikut kelas tambahan");
        }

        System.out.println("");

        if( namaLengkap.equals( "John Foley" ) ){
            System.out.println("Kamu dapat fasilitas khusus");
        }else{
            System.out.println("Kamu dapat fasilitas biasa");
        }

        if( apakahWni == true ){
            System.out.println("Dapat fasilitas Indonesia");
        }else{
            System.out.println("Dapat fasilitas Non Indonesia");
        }

    }

}
