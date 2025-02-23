public class MataKuliah21 {
    String kodeBD, nama;
    int sks, jumlahJam;

    public MataKuliah21() {
        this.kodeBD = "BD24";
        this.nama = "Basis Data";
        this.sks = 2;
        this.jumlahJam = 4;
    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeBD = kodeBD;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("=========================");
        System.out.println("Kode Mata Kuliah : " + kodeBD);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("=========================");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sksBaru);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan, sekarang " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam - jam >= 0) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi, sekarang " + this.jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        }
    }
}
