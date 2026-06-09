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
    protected String judul;
    protected String jurnalis;

    public Berita(String judul, String jurnalis) {
        this.judul = judul;
        this.jurnalis = jurnalis;
    }

    public String getInfoBerita() {
        return "Judul: " + judul + "\nJurnalis: " + jurnalis + "\n";
    }
}
