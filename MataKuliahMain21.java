public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.tampilInformasi();

        MataKuliah21 BD2 = new MataKuliah21("BDA26", "Basis Data dan Algoritma", 2, 6);
        mk1.tampilInformasi();

        
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(4);
        mk1.tampilInformasi();
    }
}
