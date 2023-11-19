public class Main {
    public static void main(String[] args) {
        Trapesium tp = new Trapesium(12, 15, 32, 25, 10);

        tp.hitungKeliling();
        tp.hitungLuas();

        System.out.println("Luas Trapesium : "+tp.getLuas());
        System.out.println("Keliling Trapesium : "+tp.getKeliling());
    }
}
