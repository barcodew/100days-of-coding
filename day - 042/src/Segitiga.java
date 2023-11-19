public class Segitiga extends BangunDatar implements Geometri {

    private double alas, tinggi, sisi;

    public Segitiga() {
    }

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungKeliling() {
            keliling = 3*sisi;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5*alas*tinggi;
    }

    @Override
    public double getKeliling() {
       return keliling;
    }

    @Override
    public double getLuas() {
        return luas;
    }

}
