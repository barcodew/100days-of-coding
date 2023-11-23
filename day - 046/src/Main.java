public class Main {
    public static void main(String[] args) {
       BelahKetupat ketupat = new BelahKetupat(12, 12, 20);

       ketupat.hitungKeliling();
       ketupat.hitungLuas();
       System.out.println("Luas Belah Ketupat : "+ketupat.getLuas());
       System.out.println("Keliling Belah Ketupat : "+ketupat.getKeliling());

    }
}
