import java.util.Random;
import java.util.Scanner;

public class RandomString {

    private static String generateRandomString(int length){
        Random rand = new Random();

        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randIndex = rand.nextInt(word.length());
            sb.append(word.charAt(randIndex));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        System.out.println(generateRandomString(length));

        input.close();
    }
}
