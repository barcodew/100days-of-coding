import java.util.Random;

public class AngkaRandom {
    public static void main(String[] args) {
        int batasAwal = 1;
        int batasAkhir = 100;

        Random random = new Random();

        int angkaRandom = random.nextInt(batasAkhir - batasAwal + 1) + batasAwal;

        System.out.println("Angka Random antara " + batasAwal + " dan " + batasAkhir + ": " + angkaRandom);
    }
}
