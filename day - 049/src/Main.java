import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[] arrayData = { 1, 2, 3, 4, 5, 6, 44, 4, 23, 45, 7, 8, 9, 23, 4, 4, 5, 56, };
        System.out.print("Masukkan Data : ");
        int x = input.nextInt();
        int temp = -1;
        for (int i = 0; i < arrayData.length; i++) {
            if (x == arrayData[i]) {
                temp = i;
            }
        }
        if (temp == -1) {
            System.out.println("Data tidak terdaftar!");
        } else {
            System.out.println("index " + x + " Adalah : " + temp);
        }
    }
}
