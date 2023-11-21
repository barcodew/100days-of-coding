public class Main {
    public static void main(String[] args) {
        JajarGenjang genjang = new JajarGenjang();

        genjang.setAlas(12);
        genjang.setTinggi(20);
        genjang.setSisimiring(13);
        genjang.hitungKeliling();
        genjang.hitungLuas();

        System.out.println("Keliling Jajar Genjang = "+genjang.getKeliling());
        System.out.println("Luas Jajar Genjang = "+genjang.getLuas());

    }
}
