public class mainPenitipan {
    public static void main(String[] args) {
        System.out.println("Penitipan Hewan Untuk member");
        penitipanMember penitipan1 = new penitipanMember();
        penitipan1.caraPenitipan();
        penitipan1.daftarHarga();

        System.out.println("Penitipan hewan Untuk Non Member");
        penitipanNonMember penitipan2 = new penitipanNonMember();
        penitipan2.caraPenitipan();
        penitipan2.daftarHarga();
    }
}