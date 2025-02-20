public class Mahasiswa21 {
    String nama;
    String nim;
    String kelas;
    double ipk;

public Mahasiswa21() {}

public Mahasiswa21(String nm, String nim, String kls, double ipk) {
    nama = nm;
    this.nim = nim;
    kelas = kls;
    this.ipk = ipk;
}

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.5) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}