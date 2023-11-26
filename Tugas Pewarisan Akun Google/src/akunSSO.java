public class akunSSO extends baseAkun {
    public String UsernameSSO;
    public String PinAutentifikasi;

    public void informasiAkun() {
        System.out.println("Informasi Akun SSO");
    }
    
    @Override
    public void caraLogin() {
        System.out.println("Tata Cara Login Akun SSO");
        super.caraLogin();
    }
}