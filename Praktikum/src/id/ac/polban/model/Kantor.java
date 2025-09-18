package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

// Aggregation: Kantor "memiliki" banyak Karyawan
public class Kantor {
    private String namaKantor;
    private List<Karyawan> daftarKaryawan;

    public Kantor(String namaKantor) {
        this.namaKantor = namaKantor;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public List<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }

    public String getNamaKantor() {
        return namaKantor;
    }
}
