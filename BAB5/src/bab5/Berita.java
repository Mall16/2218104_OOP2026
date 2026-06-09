/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5;

/**
 *
 * @author ADMIN
 */
public class Berita {
    String idBerita, judul, game;

    // OVERLOADING 1: Method tanpa parameter game
    public void setBerita(String id, String judul) {
        this.idBerita = id;
        this.judul = judul;
        this.game = "Umum / Semua Game";
    }

    // OVERLOADING 2: Method dengan parameter game
    public void setBerita(String id, String judul, String game) {
        this.idBerita = id;
        this.judul = judul;
        this.game = game;
    }

    // Method yang akan di-Override oleh class anak
    public String getJenisBerita() {
        return "Berita Umum E-Sports";
    }
}
