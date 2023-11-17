public class Main {
    public static void main(String[] args) {
        PersegiPanjang panjang = new PersegiPanjang();

        panjang.setLebar(20);
        panjang.setPanjang(30);
        panjang.hitungKeliling();
        panjang.hitungLuas();
        System.out.println("Luas Persegi Panjang    : "+panjang.getLuas());
        System.out.println("Keliling Persegi Panjang    : "+panjang.getKeliling());
    }
}
