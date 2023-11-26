public class platPrioritas extends basePlat {
    public String JenisKendaraanPrioritas;

    public void informasiJalur() {
        System.out.println("Informasi Jalur Alternatif Kendaraan Prioritas");
    }

    @Override
    public void jamLewat() {
        System.out.println("Informasi Jam Lewat Prioritas");
        super.jamLewat();
    }
}