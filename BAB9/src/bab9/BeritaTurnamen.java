/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9;

/**
 *
 * @author ADMIN
 */
public class BeritaTurnamen extends Berita implements IPublikasiDigital, IMonetisasi, IValidasiFakta {
    
   @Override 
    public String getJenisBerita() {
        return "Hasil Turnamen";
    }

    // METHOD SPESIFIK
    public String dapatkanBonusJuara() {
        return "Hadiah Turnamen: Piala E-Sports & Sertifikat MVP Nasional!";
    }

    // --- IMPLEMENTASI 3 INTERFACE ---
    @Override
    public String shareKeSosmed() {
        return "Telah dibagikan otomatis ke Instagram E-Sports.";
    }

    @Override
    public String hitungPendapatanIklan() {
        return "Pendapatan Iklan Video: Rp 5.000.000";
    }

    @Override
    public String cekSumberValid() {
        return "Sumber divalidasi dari Panitia Turnamen Resmi.";
    }
}
