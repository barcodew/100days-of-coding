public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        segitiga.setAlas(10);
        segitiga.setTinggi(20);
        segitiga.setSisi(30);
        segitiga.hitungKeliling();
        segitiga.hitungLuas();
        System.out.println("Luas Segitiga : "+segitiga.getLuas());
        System.out.println("Keliling Segitiga : "+segitiga.getKeliling());
    }
}
