public class tappingTamu extends baseTapping {
    public String NoTamu;
    public String Kepentingan;

    public void informasiPJ() {
        System.out.println("Informasi Penanggung Jawab Untuk Tamu");
    }
    
    @Override
    public void informasiRuangan() {
        System.out.println("Informasi Ruangan Perusahaan Yang Dapat Dikunjungi Tamu");
        super.informasiRuangan();
    }
}