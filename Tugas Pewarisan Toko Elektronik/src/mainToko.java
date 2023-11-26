public class mainToko {
    public static void main(String[] args) {
        System.out.println("Pelanggan Baru Toko Elektronik");
        tokoPelangganBaru toko1 = new tokoPelangganBaru();
        toko1.detailBarang();
        toko1.daftarHarga();

        System.out.println("Pelanggan Tetap Toko Elektronik");
        tokoPelangganTetap toko2 = new tokoPelangganTetap();
        toko2.detailBarang();
        toko2.daftarHarga();
    }
}