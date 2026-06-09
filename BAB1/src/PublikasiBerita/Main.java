package PublikasiBerita;

public class Main {
    public static void main(String[] args) {
                // 1. Membuat objek baru (instansiasi) dari class PublikasiBerita
        PublikasiBerita beritaSatu = new PublikasiBerita();
                // 2. Mengisi nilai pada atribut
        beritaSatu.judulBerita = "Pemuda Sakti Melaju ke Grand Final Turnamen Internasional!";
        beritaSatu.kategoriGame = "Mobile Legends";
        beritaSatu.penulis = "Hikmal Fadhilah";
                // 3. Menampilkan informasi atribut ke layar
        System.out.println("=== SISTEM PUBLIKASI BERITA E-SPORTS ===");
        System.out.println("Judul Berita : " + beritaSatu.judulBerita);
        System.out.println("Kategori     : " + beritaSatu.kategoriGame);
        System.out.println("Jurnalis     : " + beritaSatu.penulis);
        System.out.println("----------------------------------------");
                // 4. Memanggil method void (tanpa nilai kembalian)
        beritaSatu.terbitkanBerita();
                // 5. Memanggil method dengan return (nilai kembalian)
        int target = beritaSatu.targetViews(50000);
        System.out.println("Target views : " + target + " pembaca");
                System.out.println("----------------------------------------");
                // 6. Simulasi memanggil method lain (misal ada revisi)
        beritaSatu.tarikBerita();
    }
}