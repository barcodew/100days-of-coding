import java.util.Scanner;

public class MenghitungAngkaYangHabisDiBagi3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                total++;
            }
        }
        System.out.println("Total Angka Yang Habis Dibagi 3 Sebanyak : "+total +" Angka");
        input.close();
    }
}
