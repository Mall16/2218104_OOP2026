/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemberitaesport;

/**
 *
 * @author ADMIN
 */
public class BeritaTransfer extends Berita {
    private String namaPemain;

    public BeritaTransfer(String judul, String jurnalis, String namaPemain) {
        super(judul, jurnalis);
        this.namaPemain = namaPemain;
    }

    @Override
    public String getInfoBerita() {
        return "--- BERITA TRANSFER ---\n" + super.getInfoBerita() + "Pro-Player: " + namaPemain + "\n\n";
    }
}
