public class mainReservasi {
    public static void main(String[] args) {
        System.out.println("Reservasi BPJS");
        reservasiBPJS reservasi1 = new reservasiBPJS();
        reservasi1.tipeReservasi();
        reservasi1.hargaReservasi();

        System.out.println("Reservasi Reguler");
        reservasiReguler reservasi2 = new reservasiReguler();
        reservasi2.tipeReservasi();
        reservasi2.hargaReservasi();

        System.out.println("Reservasi VIP");
        reservasiVIP reservasi3 = new reservasiVIP();
        reservasi3.tipeReservasi();
        reservasi3.hargaReservasi();
    }
}