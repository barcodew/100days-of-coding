public class Persegi extends BangunDatar implements Geometri {

    private double sisi;

    
    public Persegi() {
    }



    public Persegi(double sisi) {
        this.sisi = sisi;
    }


    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    

    @Override
    public void hitungKeliling() {
        keliling = 4*sisi;
    }

    @Override
    public void hitungLuas() {
        luas = sisi*sisi;
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
