public class mainPlat {
    public static void main(String[] args) {
        System.out.println("Plat Ganjil");
        platGanjil plat1 = new platGanjil();
        plat1.jamLewat();
        plat1.informasiJalur();

        System.out.println("Plat Genap");
        platGenap plat2 = new platGenap();
        plat2.jamLewat();
        plat2.informasiJalur();

        System.out.println("Plat Kendaraan Prioritas");
        platPrioritas plat3 = new platPrioritas();
        plat3.jamLewat();
        plat3.informasiJalur();
    }
}