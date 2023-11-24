public class BelahKetupat extends BangunDatar implements Geometri {
    private double diagonal1, diagonal2, sisi;

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public BelahKetupat() {
    }

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5 * diagonal1 * diagonal2;
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
