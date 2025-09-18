package id.ac.polban.model;

public class Karyawan {
    private String nama;
    private String jabatan;
    private double gaji;

    // Static variable untuk menghitung jumlah karyawan
    private static int jumlahKaryawan = 0;

    public Karyawan(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        jumlahKaryawan++;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public static int getJumlahKaryawan() {
        return jumlahKaryawan;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
               "Jabatan: " + jabatan + "\n" +
               "Gaji: " + gaji;
    }
}
