public class MainApp {
    public static void main(String[] args) {

        // TO DO: Create expedisi Object from Ekspedisi Class
        System.out.println("\n");
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        ekspedisi.informasi();

        // TO DO: Create teluexpress Object from TelUExpress Class
        System.out.println("\n");
        TelUExpress telUExpress = new TelUExpress(100, "Bandung", 50000, true);
        telUExpress.informasi();
        telUExpress.ambil("Sukabirus");
        telUExpress.antar(1628368);
        telUExpress.antar(107868, 18029182);

        // TO DO: Create friexpress Object from FRIExpress Class
        System.out.println("\n");
        FRIExpress friExpress = new FRIExpress(30, "Bojongsoang", 30000, true);
        friExpress.informasi();
        friExpress.terima(2000);
        friExpress.kirim("Lembang");
        friExpress.kirim("Braga", "Rancaekek");
        System.out.println("\n");
    }
}
