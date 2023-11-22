public class PersegiPanjang extends BangunDatar implements Geometri {

    private double panjang, lebar;

    public PersegiPanjang() {}

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2*(panjang+lebar);
    }

    @Override
    public void hitungLuas() {
        luas = panjang*lebar;
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
