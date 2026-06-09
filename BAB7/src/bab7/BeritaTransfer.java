/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7;

/**
 *
 * @author ADMIN
 */
public class BeritaTransfer extends Berita {
    
    @Override 
    public String getJenisBerita() {
        return "Transfer Pemain";
    }

    // METHOD SPESIFIK: Hanya ada di kelas BeritaTransfer (Untuk Downcasting)
    public String dapatkanDetailKontrak() {
        return "Status Kontrak: Kontrak Roster Resmi Ditandatangani!";
    }
}
