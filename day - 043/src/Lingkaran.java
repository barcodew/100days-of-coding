public class Lingkaran extends BangunDatar implements Geometri {
    private double jarijari;

    public Lingkaran() {
    }

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    @Override
    public void hitungKeliling() {
        keliling = Geometri.PI * 2 * jarijari;
    }

    @Override
    public void hitungLuas() {
        luas = Geometri.PI * (jarijari * jarijari);
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
