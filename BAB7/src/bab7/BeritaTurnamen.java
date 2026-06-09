/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7;

/**
 *
 * @author ADMIN
 */
public class BeritaTurnamen extends Berita {
    
   @Override 
    public String getJenisBerita() {
        return "Hasil Turnamen";
    }

    // METHOD SPESIFIK: Hanya ada di kelas BeritaTurnamen (Untuk Downcasting)
    public String dapatkanBonusJuara() {
        return "Hadiah Turnamen: Piala E-Sports & Sertifikat MVP Nasional!";
    }
}
