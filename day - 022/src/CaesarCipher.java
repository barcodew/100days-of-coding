import java.util.Scanner;

public class CaesarCipher {
    public static String encryptCaesarCipher(String pesan, int kunci) {
        String result = "";
        for (int i = 0; i < pesan.length(); i++) {
            char currentChar = pesan.charAt(i);
            int currentCharPos = (int) currentChar;
            int newCharPos = currentCharPos + kunci;
            char newChar = (char) newCharPos;
            result += newChar;
        }
        return result;
    }

    public static String decryptCaesarCipher(String pesan, int kunci) {
        String result = "";
        for (int i = 0; i < pesan.length(); i++) {
            char currentChar = pesan.charAt(i);
            int currentCharPos = (int) currentChar;
            int newCharPos = currentCharPos - kunci;
            char newChar = (char) newCharPos;
            result += newChar;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pesan = input.nextLine();
        int kunci = 3;

        String encryptedCaesarCipher = encryptCaesarCipher(pesan, kunci);
        System.out.println("Encrypted Caesar Cipher: " + encryptedCaesarCipher);
        String decryptedCaesarCipher = decryptCaesarCipher(encryptedCaesarCipher, kunci);
        System.out.println("Decrypted Caesar Cipher: " + decryptedCaesarCipher);

    }
}
