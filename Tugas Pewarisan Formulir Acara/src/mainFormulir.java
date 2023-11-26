public class mainFormulir {
    public static void main(String[] args) {
        System.out.println("Formulir Mahasiswa");
        formulirMahasiswa formulir1 = new formulirMahasiswa();
        formulir1.caraBayar();
        formulir1.tataTertib();

        System.out.println("Formulir Dosen");
        formulirDosen formulir2 = new formulirDosen();
        formulir2.caraBayar();
        formulir2.tataTertib();

        System.out.println("Formulir Admin");
        formulirAdmin formulir3 = new formulirAdmin();
        formulir3.caraBayar();
        formulir3.tataTertib();
    }
}
