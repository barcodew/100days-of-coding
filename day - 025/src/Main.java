import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int faktorial = factorial(n);
        System.out.println("Faktorial(" + n + ") = " + faktorial);
    }
}