import java.util.Scanner;

public class Main {
    public static double countLenght(double panjang, int menu) {
        double result = 0;
        double value = panjang;
        switch (menu) {
            case 1:
                result = value / 1000;
                break;
            case 2:
                result = value / 100;
                break;
            case 3:
                result = value / 10;
                break;
            case 4:
                result = value;
                break;
            case 5:
                result = value * 10;
                break;
            case 6:
                result = value * 100;
                break;
            case 7:
                result = value * 1000;
                break;

            default:
                break;
        }
        return result;
    }

    static void menu() {
        System.out.println("[1] Kilometer");
        System.out.println("[2] Hektometer");
        System.out.println("[3] Dekameter");
        System.out.println("[4] Meter");
        System.out.println("[5] Desimeter");
        System.out.println("[6] Centimeter");
        System.out.println("[7] Milimeter");
        System.out.println("[0] Exit");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int selectedMenu;
        double panjang;
        boolean startProgram = true;

        while (startProgram) {
            menu();
            System.out.println("Pilih Menu : ");
            selectedMenu = input.nextInt();
            if (selectedMenu == 0) {
                break;
            }
            System.out.println("Masukkan Panjang (Meter) : ");
            panjang = input.nextDouble();

            switch (selectedMenu) {
                case 1:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " KM");
                    break;
                case 2:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " HM");
                    break;
                case 3:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " DAM");
                    break;
                case 4:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " M");
                    break;
                case 5:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " DM");
                    break;
                case 6:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " CM");
                    break;
                case 7:
                    System.out.println("Hasil Konversi : " + countLenght(panjang, selectedMenu) + " MM");
                    break;
                case 0:
                    startProgram = false;
                    break;

                default:
                    break;
            }
        }
        System.out.println("Program selesai, have a nice day! ");

    }
}
