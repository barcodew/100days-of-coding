import java.util.Scanner;

public class Main {

    public static void perkalian(int a) {
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + a + " = " + i * a);
        }
        System.out.println("-------------------");

    }

    public static void pembagian(int a) {
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            int hasil = a/i;
            System.out.println(a + " : " + i + " = " + hasil);
        }
        System.out.println("-------------------");

    }

    public static void PENJUMLAHAN(int a) {
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            int hasil = i + a;
            System.out.println(i + " + " + a + " = " + hasil);
        }
        System.out.println("-------------------");

    }

    public static void PENGURANGAN(int a) {
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            int hasil = a - i ;
            System.out.println(a + " - " + i + " = " + hasil);
        }
        System.out.println("-------------------");

    }

    static void menu() {
        System.out.println("------------------------------");
        System.out.println("------ TABEL MATEMATIKA ------");
        System.out.println("------------------------------");
        System.out.println("[1] PERKALIAN");
        System.out.println("[2] PEMBAGIAN");
        System.out.println("[3] PENJUMLAHAN");
        System.out.println("[4] PENGURANGAN");
        System.out.println("[0] EXIT");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
        int selectMenu = input.nextInt();
        while (true) {
            System.out.print(" Ke - : ");
            int angkaK = input.nextInt();
            if (selectMenu == 1) {
                perkalian(angkaK);
            } else if (selectMenu == 2) {
                pembagian(angkaK);
            } else if (selectMenu == 3) {
                PENJUMLAHAN(angkaK);

            } else if (selectMenu == 4) {
                PENGURANGAN(angkaK);

            } else if (selectMenu == 0) {
                break;
            } else {
                System.out.println("Pilih Menu Dengan Benar!");
            }
            System.out.print("Lanjut? (Y/n) : ");
            String lanjut = input.next();
            if (lanjut.toLowerCase().equals("n")) {
                break;
            }

            menu();
            selectMenu = input.nextInt();
        }
        System.out.println("Program Selesai!, have a nice day!");

    }

}
