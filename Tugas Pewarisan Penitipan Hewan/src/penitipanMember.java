public class penitipanMember extends basePenitipan {
    public String KartuMember;
    public String Kupon;

    public void caraPenitipan() {
        System.out.println("Tata Cara Penitipan Hewan Peliharaan Member");
    }
    
    @Override
    public void daftarHarga() {
        System.out.println("Informasi Daftar Harga Spesial Dengan Kupon Member");
        super.daftarHarga();
    }
}