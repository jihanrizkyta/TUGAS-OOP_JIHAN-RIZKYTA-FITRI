public class mainTiket {
    public static void main(String[] args) {
        System.out.println("Tiket Pameran Untuk Member");
        tiketMember tiket1 = new tiketMember();
        tiket1.informasiLukisan();
        tiket1.daftarKit();

        System.out.println("Tiket Pameran Untuk Pemilik Tiket OTS");
        tiketOTS tiket2 = new tiketOTS();
        tiket2.informasiLukisan();
        tiket2.daftarKit();

        System.out.println("Tiket Pameran Untuk Umum");
        tiketUmum tiket3 = new tiketUmum();
        tiket3.informasiLukisan();
        tiket3.daftarKit();
    }
}