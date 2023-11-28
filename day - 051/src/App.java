import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[] dataArray = new int[input.nextInt()];

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = input.nextInt();
        }

        Arrays.sort(dataArray);
        int awal = dataArray[0];
        int akhir = awal;

        for (int i = 1; i < dataArray.length; i++) {
            if (akhir + 1 == dataArray[i]) {
                akhir = dataArray[i];
            } else if (akhir == dataArray[i]) {
                continue;
            } else {
                if (awal != akhir) {
                    System.out.print(awal + "-" + akhir + ",");
                } else {
                    System.out.print(awal + ",");
                }
                awal = dataArray[i];
                akhir = dataArray[i];
            }
        }
        if (awal != akhir) {
            System.out.print(awal + "-" + akhir);
        } else {
            System.out.print(awal);
        }
    }
}
