public class TelUExpress extends Ekspedisi// ...
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;

    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antatInter) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antatInter;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi() {
        if (antarInter == true) {
            System.out.println("Ekspedisi TelUExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di "
                    + pusat + " mempunyari tarif sebesar " + tarif + " perkilogram");
            System.out.println("Selain itu ekspedisi ini melayani pelayanan internasional");
        } else {
            System.out.println("Ekspedisi ini tidak ditemukan");
        }
    }

    // TO DO: Create 'ambil' Method to pick up a package
    public String ambil(String tempat) {
        System.out.println("TelUExpress berhasil mengambil paket ke " + tempat);
        return tempat;
    }

    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi) {
        System.out.println("TelUExpress berhasil mengantar paket dengan nomor resi " + resi);
    }

    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1, int resi_2) {
        System.out.println("TelUExpress berhasil mengantar paket dengan nomor resi " + resi_1 + " dan " + resi_2);
    }
}
