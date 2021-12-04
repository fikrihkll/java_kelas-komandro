package com.teamdagger;

public class ItemKeranjang {

    String namaBarang;
    int hargaBarang;
    int qty;
    String note;

    //Constructor
    public ItemKeranjang(String namaBarang, int hargaBarang, int qty, String note) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.qty = qty;
        this.note = note;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
