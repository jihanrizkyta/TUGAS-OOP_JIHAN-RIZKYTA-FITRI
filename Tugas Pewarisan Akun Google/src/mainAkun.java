public class mainAkun {
    public static void main(String[] args) {
        System.out.println("Akun Google Pribadi");
        akunPribadi akun1 = new akunPribadi();
        akun1.caraLogin();
        akun1.informasiAkun();

        System.out.println("Akun Google SSO");
        akunSSO akun2 = new akunSSO();
        akun2.caraLogin();
        akun2.informasiAkun();
    }
}