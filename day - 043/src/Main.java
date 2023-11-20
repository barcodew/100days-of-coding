public class Main {
    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran();

        bulat.setJarijari(14);
        bulat.hitungKeliling();
        bulat.hitungLuas();

        System.out.println("Luas Lingkaran  dengan jari jari : "+bulat.getJarijari() +" = "+bulat.getLuas());
        System.out.println("Keliling Lingkaran  dengan jari jari : "+bulat.getJarijari() +" = "+bulat.getKeliling());
    }
}
