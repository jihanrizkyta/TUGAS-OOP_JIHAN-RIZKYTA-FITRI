public class mainTapping {
    public static void main(String[] args) {
        System.out.println("Tapping untuk Karyawan");
        tappingKaryawan tapping1 = new tappingKaryawan();
        tapping1.informasiPJ();
        tapping1.informasiRuangan();

        System.out.println("Tapping Untuk Staff");
        tappingStaff tapping2 = new tappingStaff();
        tapping2.informasiPJ();
        tapping2.informasiRuangan();

        System.out.println("Tapping Untuk Tamu");
        tappingTamu tapping3 = new tappingTamu();
        tapping3.informasiPJ();
        tapping3.informasiRuangan();
    }
}