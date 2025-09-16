/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ADELLA
 */

import java.util.ArrayList;
import java.util.Scanner;
import model.Product;

public class CRUD {
    private final ArrayList<Product> barang = new ArrayList<>();
    private final ArrayList<Product> soldOut = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

     // Constructor, nah ini data data barang nya
    public CRUD() {
        barang.add(new Product("Blouse Motif Bunga", "Baju", "Second", 70000));
        barang.add(new Product("Kemeja Kotak-Kotak Flanel", "Baju", "Second", 75000));
        barang.add(new Product("Crop Top Polos", "Baju", "Second", 50000));
        barang.add(new Product("Celana Jeans Skinny", "Celana", "Second", 120000));
        barang.add(new Product("Rok Span Hitam", "Rok", "New", 60000));
        barang.add(new Product("Jaket Denim", "Jaket", "Second", 130000));
        barang.add(new Product("Hijab Segi Empat Polos", "Jilbab", "New", 20000));
        barang.add(new Product("Totebag Kanvas", "Tas", "Second", 50000));
        barang.add(new Product("Kalung Choker", "Aksesoris", "New", 45000));
        barang.add(new Product("Pin Hijab", "Aksesoris", "New", 15000));
        barang.add(new Product("Kacamata Frame Kotak", "Aksesoris", "New", 100000));
    }
    
    // tambah barang
    public void tambahBarang() {
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan kategori: ");
        String kategori = input.nextLine();
        System.out.print("Masukkan kondisi (New/Second): ");
        String kondisi = input.nextLine();
        System.out.print("Masukkan harga (tidak perlu pakai koma, contoh 7500): Rp. ");
        double harga = input.nextDouble();
        input.nextLine();

        barang.add(new Product(nama, kategori, kondisi, harga));
        System.out.println("| Yeyyy barang berhasil ditambahkan!");
    }

    // lihat barang
    public void lihatBarang() {
    if (barang.isEmpty()) {
        System.out.println("| Yahh belum ada barang yang tersedia..");
    } else {
        System.out.println("\n===== Daftar Barang =====");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n",
                          "No", "Nama", "Kategori", "Kondisi", "Harga");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < barang.size(); i++) {
            Product p = barang.get(i);
            System.out.printf("| %-3d | %-25s | %-15s | %-10s | Rp.%-10s |\n",
                              (i + 1), p.getNama(), p.getKategori(),
                              p.getKondisi(), String.format("%,.0f", p.getHarga()));
        }
        System.out.println("-------------------------------------------------------------------------------\n");
    }
}

    // update barang
    public void updateBarang() {
        lihatBarang();
        if (barang.isEmpty()) return;

        System.out.print("| Pilih nomor barang yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= barang.size()) {
            System.out.print("Masukkan nama baru: ");
            String nama = input.nextLine();
            System.out.print("Masukkan kategori baru: ");
            String kategori = input.nextLine();
            System.out.print("Masukkan kondisi baru (New/Second): ");
            String kondisi = input.nextLine();
            System.out.print("Masukkan harga baru: Rp. ");
            double harga = input.nextDouble();
            input.nextLine();

            barang.set(index - 1, new Product(nama, kategori, kondisi, harga));
            System.out.println("| Uyeyyy barang berhasil diupdate!");
        } else {
            System.out.println("| Nah! nomor tidak valid!!");
        }
    }

    // hapus barang terus lansung pindah ke sold out
    public void hapusBarang() {
        lihatBarang();
        if (barang.isEmpty()) return;

        System.out.print("| Pilih nomor barang yang ingin dihapus (sold out): ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= barang.size()) {
            Product p = barang.remove(index - 1);
            soldOut.add(p);
            System.out.println("| Keren! Barang berhasil dipindahkan ke daftar Sold Out!");
        } else {
            System.out.println("| Yahh nomor tidak valid..");
        }
    }

    // untuk lihat daftar sold out
public void lihatSoldOut() {
    if (soldOut.isEmpty()) {
        System.out.println("| Sayang banget! Belum ada barang yang sold out!!");
    } else {
        System.out.println("\n===== Daftar Sold Out =====");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n",
                          "No", "Nama", "Kategori", "Kondisi", "Harga");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < soldOut.size(); i++) {
            Product p = soldOut.get(i);
            System.out.printf("| %-3d | %-25s | %-15s | %-10s | Rp.%-10s |\n",
                              (i + 1), p.getNama(), p.getKategori(),
                              p.getKondisi(), String.format("%,.0f", p.getHarga()));
        }
        System.out.println("-------------------------------------------------------------------------------\n");
    }
}
    // fitur baru untuk nyari barang
    public void cariBarang() {
        System.out.print("| Masukkan nama barang yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Product p : barang) {
            if (p.getNama().toLowerCase().contains(keyword)) {
                System.out.println("| Ditemukan: " + p);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("| Huhuhuu, barang tidak ditemukan..");
        }
    }
}
