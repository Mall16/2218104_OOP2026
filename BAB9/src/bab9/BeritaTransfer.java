/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9;

/**
 *
 * @author ADMIN
 */
public class BeritaTransfer extends Berita implements IPublikasiDigital, IMonetisasi, IValidasiFakta {
    
    @Override 
    public String getJenisBerita() {
        return "Transfer Pemain";
    }

    // METHOD SPESIFIK
    public String dapatkanDetailKontrak() {
        return "Status Kontrak: Kontrak Roster Resmi Ditandatangani!";
    }

    // --- IMPLEMENTASI 3 INTERFACE ---
    @Override
    public String shareKeSosmed() {
        return "Trending Topic di Twitter/X E-Sports!";
    }

    @Override
    public String hitungPendapatanIklan() {
        return "Pendapatan Iklan Artikel: Rp 2.500.000";
    }

    @Override
    public String cekSumberValid() {
        return "Sumber divalidasi dari Pengumuman Klub Resmi.";
    }
}
