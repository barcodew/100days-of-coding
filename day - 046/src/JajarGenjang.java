public class JajarGenjang extends BangunDatar implements Geometri {

    private double alas, tinggi, sisimiring;

    public JajarGenjang() {
    }

    public JajarGenjang(double alas, double tinggi, double sisimiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisimiring = sisimiring;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (alas + sisimiring);
    }

    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
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
