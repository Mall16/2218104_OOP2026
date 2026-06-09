package PublikasiBerita;

public class BeritaEsports {

    // Attribute
    int idBerita;
    String kategoriGame;
    String isiBerita;
    String penulis;
    String tanggalPublikasi;

    // CONSTRUCTOR ---
    // Constructor ini akan meminta input data saat objek baru diciptakan
    public BeritaEsports(int id, String judul, String game, String isi, String jurnalis, String tanggal) {
        this.idBerita = id;
        this.kategoriGame = game;
        this.isiBerita = isi;
        this.penulis = jurnalis;
        this.tanggalPublikasi = tanggal;
    }
    // ------------------------------

    BeritaEsports(int i, String mobile_Legends, String pemuda_Sakti_Lolos_ke_Grand_Final_M6, String hikmal_Fadhilah, String _Maret_2026) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Method Operasi CRUD
    public void tambahBerita() {
        System.out.println("Status: Berita E-Sports baru berhasil ditambahkan ke sistem.");
    }

    public void tampilBerita() {
        System.out.println("=== DETAIL BERITA E-SPORTS ===");
        System.out.println("ID Berita   : " + idBerita);
        System.out.println("Game        : " + kategoriGame);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tanggal     : " + tanggalPublikasi);
        System.out.println("Isi Berita  : " + isiBerita);
        System.out.println("==============================");
    }

    public void ubahBerita() {
        System.out.println("Status: Berita E-Sports berhasil diubah/direvisi.");
    }

    public void hapusBerita() {
        System.out.println("Status: Berita E-Sports berhasil dihapus dari sistem.");
    }

    public void terbitkanBerita() {
        System.out.println("Status: Berita resmi DITERBITKAN ke portal media E-Sports!");
    }
}