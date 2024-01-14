import java.util.Scanner;

public class GetTheMiddleCharacter {

    private static String getMiddle(String kata) {
        int getLength = kata.length();
        int indexKataTengah = getLength / 2;

        if (getLength % 2 == 0) {
            return kata.substring(indexKataTengah - 1, indexKataTengah + 1);
        } else {
            return kata.substring(indexKataTengah, indexKataTengah + 1);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String kata = input.next();

        System.out.println(getMiddle(kata));

    }
}
