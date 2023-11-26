public class administrasiMaba extends baseAdministrasi {
    public String PinSementara;

    public void informasiAdministrasi() {
        System.out.println("Informasi Administrasi Mahasiswa Baru");
    }
    
    @Override
    public void caraRegistrasi() {
        System.out.println("Tata Cara Registrasi Dengan Pin");
        super.caraRegistrasi();
    }
}