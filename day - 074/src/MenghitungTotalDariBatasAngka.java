import java.util.Scanner;

public class MenghitungTotalDariBatasAngka {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (i > 0 && i != n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sum);
            }

        }
    }
}
