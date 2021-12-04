package com.teamdagger;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Makanan makananBaru = new Makanan();
        makananBaru.tampilkanDataMakanan();

        System.out.println("Ubah Harga Baru");
        makananBaru.ubahHargaMakanan(5000);
        makananBaru.tampilkanDataMakanan();

        System.out.println(" ====================== ");

        /*
        1. Bikin Class Baru, Klik Kanan com.company -> New Java Class -> Bikin nama class ItemKeranjang -> Enter
        2. Bikin variable Nama, harga, qty dan note
        3. Bikin Contstructor di Code -> Generate lalu pilih constructor -> pilih semua variable
        4. Code -> Generate pilih Getter and Setter
        */

        ItemKeranjang item1 = new ItemKeranjang("Kursi",500000,2,"-");

        System.out.println("Nama Barang : " + item1.getNamaBarang());
        System.out.println("Harga Barang : " + item1.getHargaBarang());
        System.out.println("Harga Qantity : " + item1.getQty());
        System.out.println("Note : " + item1.getNote());

        System.out.println(" ====================== ");

        ArrayList<ItemKeranjang> listKeranjang = new ArrayList<>();

        listKeranjang.add( new ItemKeranjang("Laptop Baru",6500000,1,"Warna Merah") );
        listKeranjang.add( new ItemKeranjang("Kipas",450000,1,"Yang paling kenceng kipasnya") );
        listKeranjang.add( new ItemKeranjang("Sepatu Murah",45000,2,"Size 43, Warna Kuning") );

        for(int urutan=0 ; urutan < listKeranjang.size() ; urutan++ )
        {
            System.out.println("Item Ke " + urutan);
            System.out.println("Nama Barang : " + listKeranjang.get(urutan).getNamaBarang() );
            System.out.println("Harga Barang : " + listKeranjang.get(urutan).getHargaBarang() );
            System.out.println("Qty Barang : " + listKeranjang.get(urutan).getQty() );
            System.out.println("Note : " + listKeranjang.get(urutan).getNote() );
            System.out.println(" --------------------");
        }


    }

}
