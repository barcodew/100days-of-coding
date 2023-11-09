import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sisi = input.nextInt();

        String[] data = new String[sisi];
        for (int i = 0; i < sisi; i++) {
            data[i] = input.next();
        }
        if (sisi > 0) {
            int max = 0;

            for (int i = 0; i < sisi; i++) {
                int panjang = data[i].length();
                max = Math.max(max, panjang);

                System.out.print("+");
                if (panjang > 0) {
                    for (int j = 0; j < max; j++) {
                        System.out.print("---+");
                    }
                    System.out.println();
                    // pola | |
                    System.out.print("|");
                    if (panjang > 0) {
                        for (int j = 0; j < panjang; j++) {
                            char cj = data[i].charAt(j);
                            String sj = String.valueOf(cj);
                            int value = Integer.parseInt(sj);
                            if (value == 0) {
                                System.out.print(" o |");
                            } else if (value == 1) {
                                System.out.print(" x |");
                            } else {
                                System.out.print("   |");
                            }

                        }

                    }
                    System.out.println();
                    max = panjang;
                }
            }
            System.out.print("+");
            for (int j = 0; j < max; j++) {
                System.out.print("---+");
            }
            System.out.println();

        }
    }
}
