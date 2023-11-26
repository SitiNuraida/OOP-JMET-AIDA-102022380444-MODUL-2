public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    // Contruktor
    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    // Method public toString()
    @Override
    public String toString() {
        return super.toString() + "\nJumlah Pintu: " + jumlahPintu;
    }

    // Method hitung waktu tempuh
    public double hitungWaktuTempuh(double jarak) {
        double waktuTempuh = super.hitungWaktuTempuh(3000);
        return waktuTempuh;
    }

}
