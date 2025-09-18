package id.ac.polban.service;

import id.ac.polban.model.Karyawan;

// Dependency: Service ini "bergantung" pada objek Karyawan
public class KaryawanService {
    public void cetakInformasi(Karyawan karyawan) {
        System.out.println("=== Informasi Karyawan ===");
        System.out.println(karyawan);
    }
}
