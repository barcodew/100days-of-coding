import java.util.Scanner;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int menu;
        while (true) {
            System.out.println("1 . To Upper Case");
            System.out.println("2 . To Lower Case");
            System.out.println("0 . Exit");
            menu = input.nextInt();
            System.out.println("Masukkan Kata : ");
            input.nextLine();
            String kata = input.nextLine();

            if (menu == 1) {
                System.out.println(kata.toUpperCase());
            }
            if (menu == 2) {
                System.out.println(kata.toLowerCase());
            }

            if (menu == 0) {
                break;
            }
        }

    }
}
