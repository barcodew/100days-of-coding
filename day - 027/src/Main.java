
public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Masukkan Lebar  :");
        int lebar = input.nextInt();
        System.out.println("Masukkan Sisi  :");
        int sisi = input.nextInt();

        System.out.println("Rows : " + sisi);
        System.out.println("Cols : " + lebar);

        String[] data = new String[sisi];

        for (int i = 0; i < sisi; i++) {
            data[i] = input.next();
        }
        if (sisi > 0 && lebar > 0) {
            System.out.print("+");
            for (int j = 0; j < lebar; j++) {
                System.out.print("---+");
            }
            System.out.println();
            for (int k = 0; k < sisi; k++) {
                System.out.print("|");
                for (int l = 0; l < lebar; l++) {
                    String baris = String.valueOf(data[k].charAt(l));
                    int value = Integer.parseInt(baris);
                    if (value == 0) {

                        System.out.print(" o |");
                    } else if (value == 1) {
                        System.out.print(" x |");
                    } else {
                        System.out.print("   |");
                    }
                }
                System.out.println();
                System.out.print("+");
                for (int h = 0; h < lebar; h++) {
                    System.out.print("---+");
                }
                System.out.println();

            }
        }
    }
}
