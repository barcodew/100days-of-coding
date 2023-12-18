import java.util.Scanner;

public class DecimalTOBiner {

    static String convertBiner(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(convertBiner(n));
        input.close();
    }
}
