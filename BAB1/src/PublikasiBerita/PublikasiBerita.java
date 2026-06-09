package PublikasiBerita;

public class PublikasiBerita {
 
    String judulBerita, kategoriGame, penulis; // atribut
 
    // method dengan nilai kembalian (return)
    int targetViews(int target){ 
        return target;
    }
 
    // method tanpa nilai kembalian (void)
    void terbitkanBerita(){
        System.out.println("Status: Berita E-Sports Berhasil Dipublikasikan ke Portal Media");
    }
    
    void tarikBerita(){
        System.out.println("Status: Berita Ditarik Kembali untuk Direvisi (Unpublished)");
    }
    
    void arsipkanBerita(){
        System.out.println("Status: Berita Telah Dimasukkan ke Dalam Arsip Sistem");
    }
}