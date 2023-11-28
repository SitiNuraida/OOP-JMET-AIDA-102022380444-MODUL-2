public class FRIExpress extends Ekspedisi// ...
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    public FRIExpress(int jumlahCabang, String pusat, float tarif, boolean pecahBelah) {
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi() {
        if (pecahBelah == true) {
            System.out.println("Ekspedisi FRIExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di "
                    + pusat + " mempunyari tarif sebesar " + tarif + " perkilogram");
            System.out.println("Selain itu ekspedisi ini tidak melayani paket pecah belah");
        } else {
            System.out.println("Ekspedisi ini tidak ditemukan");
        }
    }

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket) {
        System.out.println(
                "FRIExpress baru saja menerima paket yang masuk untuk disortir sebanyak " + jumlahPaket + " paket");
    }

    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String Tujuan) {
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan " + Tujuan);
    }

    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(String tujuan_1, String tujuan_2) {
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan " + tujuan_1 + " dan " + tujuan_2);
    }
}
