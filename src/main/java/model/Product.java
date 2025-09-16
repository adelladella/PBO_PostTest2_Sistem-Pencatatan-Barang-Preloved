/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author ADELLA
 */

public class Product {
    // Properties (gunakan access modifier private)
    private String nama;
    private String kategori;
    private String kondisi;
    private double harga;

    // Constructor
    public Product(String nama, String kategori, String kondisi, double harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.kondisi = kondisi;
        this.harga = harga;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        // Format angka harga agar tampil seperti 70,000 bukan 70000.0
        DecimalFormat df = new DecimalFormat("#,###");
        return nama + " | " + kategori + " | " + kondisi + " | Rp." + df.format(harga);
    }
}