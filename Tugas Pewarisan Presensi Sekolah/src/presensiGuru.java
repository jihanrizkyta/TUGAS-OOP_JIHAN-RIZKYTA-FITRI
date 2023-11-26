public class presensiGuru extends basePresensi {
    public String NIP;
    public String MataPelajaran;

    public void informasiKonsekuensi() {
        System.out.println("Informasi Konsekuensi Keterlambatan Guru");
    }

    @Override
    public void informasiJamMasuk() {
        System.out.println("Informasi Jam Masuk Jika Ada Penugasan");
        super.informasiJamMasuk();
    }
}