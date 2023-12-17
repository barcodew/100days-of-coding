import java.util.Scanner;

public class BreakEXit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 42) {
                System.out.println("ERROR");
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
