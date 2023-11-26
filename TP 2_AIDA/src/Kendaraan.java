public class Kendaraan {
    private String nomorIdentifikasi;
    protected Double kecepatanMaksimum;
    private int kapasitasPenumpang;

    // Contructor
    public Kendaraan(String nomorIdentifikasi, Double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Method public toString()
    @Override
    public String toString() {
        return "Nomor Identifikasi: " + nomorIdentifikasi + "\nKecepatan Maksimum: " + kecepatanMaksimum
                + "\nKapasitas Penumpang: " + kapasitasPenumpang;
    }

    // Method hitung waktu tempuh
    public double hitungWaktuTempuh(double jarak) {
        return jarak / kecepatanMaksimum;
    }

}
