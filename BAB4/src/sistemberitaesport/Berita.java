/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemberitaesport;

/**
 *
 * @author ADMIN
 */
public class Berita {
    // 1. Jadikan atribut private (Ini inti Enkapsulasi)
    private String judul;
    private String jurnalis;

    // Constructor
    public Berita(String judul, String jurnalis) {
        this.judul = judul;
        this.jurnalis = jurnalis;
    }

    // 2. Buat Getter dan Setter yang public
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJurnalis() {
        return jurnalis;
    }

    public void setJurnalis(String jurnalis) {
        this.jurnalis = jurnalis;
    }

    // Method menggunakan Getter untuk memanggil variabel
    public String getInfoBerita() {
        return "Judul: " + getJudul() + "\nJurnalis: " + getJurnalis() + "\n";
    }
}
