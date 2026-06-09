package PublikasiBerita;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("SISTEM INFORMASI PUBLIKASI BERITA PADA MEDIA E-SPORTS");
        System.out.println("------------------------------------------------------\n");

        // 1. Membuat objek sekaligus MENGISI DATA menggunakan CONSTRUCTOR
        // Urutan isiannya harus sama dengan urutan pada Constructor di atas
        BeritaEsports beritaUtama = new BeritaEsports(
            101, 
            "Pemuda Sakti Lolos ke Grand Final M6!", 
            "Mobile Legends", 
            "Tim RRQ Trenggalek Menang telak 3-0 dan mengamankan tiket ke Grand Final.", 
            "Hikmal Fadhilah", 
            "13 Maret 2026"
        );

        // 2. Memanggil method untuk menjalankan fungsi sistem
        beritaUtama.tambahBerita(); // Menyimulasikan proses penambahan berita
        System.out.println(); // Spasi kosong agar rapi
        
        beritaUtama.tampilBerita(); // Menampilkan detail berita yang sudah diisi lewat constructor
        System.out.println();
        
        beritaUtama.terbitkanBerita(); // Menyimulasikan publikasi berita
    }
}