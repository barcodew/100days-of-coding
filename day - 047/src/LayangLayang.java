public class LayangLayang extends BangunDatar implements Geometri {

    private double diagonal1,diagonal2,sisiAB,sisiBC,sisiCD,sisiDA;

    

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public void setSisiAB(double sisiAB) {
        this.sisiAB = sisiAB;
    }

    public void setSisiBC(double sisiBC) {
        this.sisiBC = sisiBC;
    }

    public void setSisiCD(double sisiCD) {
        this.sisiCD = sisiCD;
    }

    public void setSisiDA(double sisiDA) {
        this.sisiDA = sisiDA;
    }

    public LayangLayang() {
    }

    public LayangLayang(double diagonal1, double diagonal2, double sisiAB, double sisiBC, double sisiCD,
            double sisiDA) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiAB = sisiAB;
        this.sisiBC = sisiBC;
        this.sisiCD = sisiCD;
        this.sisiDA = sisiDA;
    }

    @Override
    public void hitungKeliling() {
       keliling = sisiAB+sisiBC+sisiCD+sisiDA;
    }

    @Override
    public void hitungLuas() {
        luas = 0.5*diagonal1*diagonal2;
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
