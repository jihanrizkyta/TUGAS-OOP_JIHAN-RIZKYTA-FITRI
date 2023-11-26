public class mainAdministrasi {
    public static void main(String[] args) {
        System.out.println("Administrasi Mahasiswa Baru");
        administrasiMaba administrasi1 = new administrasiMaba();
        administrasi1.caraRegistrasi();
        administrasi1.informasiAdministrasi();

        System.out.println("Administrasi Mahasiswa Lama");
        administrasiMala administrasi2 = new administrasiMala();
        administrasi2.caraRegistrasi();
        administrasi2.informasiAdministrasi();
    }
}