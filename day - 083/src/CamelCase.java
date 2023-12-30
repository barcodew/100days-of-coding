import java.util.Scanner;

public class CamelCase {

    private static String convertCamelCase(String kata) {
        String[] kataSplit = kata.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String string : kataSplit) {
            sb.append(Character.toUpperCase(string.charAt(0)));
            sb.append(string.substring(1));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String kata = input.nextLine();

        System.out.println(convertCamelCase(kata));
        input.close();
    }
}
