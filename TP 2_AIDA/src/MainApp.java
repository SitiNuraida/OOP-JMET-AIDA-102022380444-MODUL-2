public class MainApp {
    public static void main(String[] args) throws Exception {
        // Informasi mobil
        System.out.println("======= Informasi Mobil ========");
        Mobil mobil = new Mobil("M1", 120.0, 5, 4);
        System.out.println(mobil.toString());
        System.out.println("Waktu tempuh dengan mobil: " + mobil.hitungWaktuTempuh(3000));

        // Informasi Bus
        System.out.println("\n======= Informasi Bus ========");
        Bus bus = new Bus("B1", 80.0, 40, 30);
        System.out.println(bus.toString());
        System.out.println("Waktu tempuh dengan bis: " + bus.hitungWaktuTempuh(300));
    }
}