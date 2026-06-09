/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemberitaesport;

/**
 *
 * @author ADMIN
 */
public class BeritaTurnamen extends Berita {
    // Atribut private
    private String namaTurnamen;

    public BeritaTurnamen(String judul, String jurnalis, String namaTurnamen) {
        super(judul, jurnalis); 
        this.namaTurnamen = namaTurnamen;
    }

    // Getter & Setter
    public String getNamaTurnamen() {
        return namaTurnamen;
    }

    public void setNamaTurnamen(String namaTurnamen) {
        this.namaTurnamen = namaTurnamen;
    }

    @Override
    public String getInfoBerita() {
        return "--- BERITA TURNAMEN ---\n" + super.getInfoBerita() + "Turnamen: " + getNamaTurnamen() + "\n\n";
    }
}
