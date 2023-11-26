public class reservasiVIP extends baseReservasi {
    public String KartuMemberVIP;
    public String KamarTambahan;

    public void hargaReservasi() {
        System.out.println("Informasi Harga Reservasi Kamar VIP");
    }

    @Override
    public void tipeReservasi() {
        System.out.println("Tipe Reservasi Kamar Tambahan Yang Dipilih");
        super.tipeReservasi();
    }
}