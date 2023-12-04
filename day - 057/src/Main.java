import java.util.Random;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("=== Konversi Nilai ===");
        System.out.println("[1] Nilai Huruf");
        System.out.println("[2] Nilai Angka");
        System.out.println("[0] Exit");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int nilai = 0;
        boolean startProgram = true;
        while (startProgram) {
            menu();
            int menu = input.nextInt();
            if (menu == 0) {
                break;
            }
            switch (menu) {
                case 1:
                    System.out.println("Masukkan Nilai Huruf");
                    String nilaiHuruf = input.next();
                    switch (nilaiHuruf) {
                        case "A":
                            System.out.println(nilai = rand.nextInt(95, 100));
                            break;
                        case "A-":
                            System.out.println(nilai = rand.nextInt(90, 94));
                            break;
                        case "B+":
                            System.out.println(nilai = rand.nextInt(80, 89));
                            break;
                        case "B":
                            System.out.println(nilai = rand.nextInt(75, 79));
                            break;
                        case "B-":
                            System.out.println(nilai = rand.nextInt(70, 74));
                            break;
                        case "C":
                            System.out.println(nilai = rand.nextInt(60, 69));
                            break;
                        case "D":
                            System.out.println(nilai = rand.nextInt(50, 59));
                            break;
                        case "E":
                            System.out.println(nilai = rand.nextInt(0, 49));
                            break;

                        default:
                            System.out.println("Masukkan Nilai Huruf Yang Sesuai!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Nilai Angka : ");
                    nilai = input.nextInt();
                    if (nilai >= 95 && nilai <= 100) {
                        System.out.println("A");
                    } else if (nilai >= 90 && nilai <= 94) {
                        System.out.println("A-");
                    } else if (nilai >= 90 && nilai <= 94) {
                        System.out.println("A-");
                    } else if (nilai >= 80 && nilai <= 89) {
                        System.out.println("B+");
                    } else if (nilai >= 75 && nilai <= 79) {
                        System.out.println("B");
                    } else if (nilai >= 70 && nilai <= 74) {
                        System.out.println("B-");
                    } else if (nilai >= 60 && nilai <= 69) {
                        System.out.println("C");
                    } else if (nilai >= 50 && nilai <= 59) {
                        System.out.println("D");
                    } else if (nilai >= 0 && nilai <= 49) {
                        System.out.println("E");
                    } else {
                        System.out.println("Nilai Tidak Valid!");
                    }

                    break;
                case 0:
                    startProgram = false;
                    break;

                default:
                    System.out.println("Pilih Menu Dengan Benar!");
                    break;
            }

        }
        System.out.println("Program Selesai, have a nice day!");
    }
}