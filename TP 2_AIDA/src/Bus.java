public class Bus extends Kendaraan {
    protected int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    // Method public toString()
    @Override
    public String toString() {
        return super.toString() + "\nJumlah Kursi: " + jumlahKursi;
    }

    // Method hitung waktu tempuh
    public double hitungWaktuTempuh(double jarak) {
        double waktuTempuh = super.hitungWaktuTempuh(300);
        return waktuTempuh;
    }
}
