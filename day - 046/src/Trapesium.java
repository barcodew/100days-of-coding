public class Trapesium extends BangunDatar implements Geometri {

    private double SisiAB, SisiBC, SisiCD, SisiDA, tinggi;

    public Trapesium() {
    }

    public Trapesium(double sisiAB, double sisiBC, double sisiCD, double sisiDA, double tinggi) {
        this.SisiAB = sisiAB;
        this.SisiBC = sisiBC;
        this.SisiCD = sisiCD;
        this.SisiDA = sisiDA;
        this.tinggi = tinggi;
    }

    public void setSisiAB(double sisiAB) {
        SisiAB = sisiAB;
    }

    public void setSisiBC(double sisiBC) {
        SisiBC = sisiBC;
    }

    public void setSisiCD(double sisiCD) {
        SisiCD = sisiCD;
    }

    public void setSisiDA(double sisiDA) {
        SisiDA = sisiDA;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void hitungKeliling() {
        keliling = SisiAB + SisiBC + SisiCD + SisiDA;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5 * tinggi * (SisiAB + SisiCD);
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
