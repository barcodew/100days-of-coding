public class Main {
    public static void main(String[] args) {
       LayangLayang layang = new LayangLayang(12, 12, 30, 30, 8, 8);

       layang.hitungKeliling();
       layang.hitungLuas();

       System.out.println("Keliling Layang Layang  : "+layang.getKeliling());
       System.out.println("Luas Layang Layang  : "+layang.getLuas());

    }
}
