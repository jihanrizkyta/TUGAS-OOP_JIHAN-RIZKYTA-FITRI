public class mainPeminjaman {
    public static void main(String[] args) {
        System.out.println("Peminjaman Untuk Pelajar");
        peminjamanPelajar peminjaman1 = new peminjamanPelajar();
        peminjaman1.caraPeminjaman();
        peminjaman1.informasiKonsekuensi();

        System.out.println("Peminjaman Untuk Umum");
        peminjamanUmum peminjaman2 = new peminjamanUmum();
        peminjaman2.caraPeminjaman();
        peminjaman2.informasiKonsekuensi();
    }
}