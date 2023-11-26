public class tokoPelangganTetap extends baseToko {
    public String KartuMember;
    public String Diskon;

    public void detailBarang() {
        System.out.println("Informasi Detail Barang Untuk Pelanggan Tetap");
    }
    
    @Override
    public void daftarHarga() {
        System.out.println("Informasi Daftar Harga Barang Dengan Diskon");
        super.daftarHarga();
    }
}