public class mainPresensi {
    public static void main(String[] args) {
        System.out.println("Presensi Murid");
        presensiMurid presensi1 = new presensiMurid();
        presensi1.informasiJamMasuk();
        presensi1.informasiKonsekuensi();

        System.out.println("Presensi Guru");
        presensiGuru presensi2 = new presensiGuru();
        presensi2.informasiJamMasuk();
        presensi2.informasiKonsekuensi();

        System.out.println("Presensi Staff");
        presensiStaff presensi3 = new presensiStaff();
        presensi3.informasiJamMasuk();
        presensi3.informasiKonsekuensi();
    }
}