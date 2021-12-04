package com.teamdagger;

public class Makanan {

    String namaMakanan = "Bakso";
    int hargaMakanan = 20000;
    String deskripsiMakanan = "Bakso adalah makanan khas Indonesia";

    //Constructor
    public Makanan() {
        System.out.println("Kelas ini baru dibuat");
    }

    public void tampilkanDataMakanan(){
        System.out.println("Makanan : " + namaMakanan);
        System.out.println("Harga : Rp." + hargaMakanan);
        System.out.println("Deskripsi : " + deskripsiMakanan);
    }

    public void ubahHargaMakanan(int hargaBaru){
        hargaMakanan = hargaMakanan + hargaBaru;
    }

}
