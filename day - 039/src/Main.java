public class Main {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSisi(20);
        kotak.hitungLuas();
        kotak.hitungKeliling();

        System.out.println("Luas : "+kotak.getLuas());
        System.out.println("keliling : "+kotak.getKeliling());
    }
}
