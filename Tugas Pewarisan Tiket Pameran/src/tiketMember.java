public class tiketMember extends baseTiket {
    public String KartuMember;

    public void informasiPJ() {
        System.out.println("Informasi Lukisan Yang Dipamerkan Untuk Member");
    }
    
    @Override
    public void daftarKit() {
        System.out.println("Daftar Kit Tambahan Yang Disediakan Khusus Member");
        super.daftarKit();
    }
}