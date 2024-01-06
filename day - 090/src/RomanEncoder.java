import java.util.Scanner;

public class RomanEncoder {

    private static String encodeRoman(int n) {
        int[] value = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        String[] simbol = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (n > 0) {
            while (n >= value[i]) {
                sb.append(simbol[i]);
                n -= value[i];
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        while (true) {
            System.out.println(encodeRoman(angka));
            angka = input.nextInt();
        }

    }
}
