public class peminjamanPelajar extends basePeminjaman {
    public String KartuPelajar;
    public String AsalSekolah;

    public void caraPeminjaman() {
        System.out.println("Tata Cara Peminjaman Pelajar");
    }
    
    @Override
    public void informasiKonsekuensi() {
        System.out.println("Informasi Konsekuensi Peminjaman Khusus Pelajar");
        super.informasiKonsekuensi();
    }
}