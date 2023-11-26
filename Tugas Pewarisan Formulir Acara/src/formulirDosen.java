public class formulirDosen extends baseFormulir {
    public String kodeDosen;

    public void tataTertib() {
        System.out.println("Tata Tertib Dosen");
    }

    @Override
    public void caraBayar() {
        System.out.println("Cara Bayar Untuk Dosen");
        super.caraBayar();
    }
}