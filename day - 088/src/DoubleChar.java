import java.util.Scanner;

public class DoubleChar {

    private static String doubleChar(String kata){
        StringBuilder sb = new StringBuilder();
        for (char ch : kata.toCharArray()) {
            sb.append(ch).append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String kata = input.nextLine();
        System.out.println(doubleChar(kata));
    }
}
