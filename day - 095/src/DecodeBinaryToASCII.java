
public class DecodeBinaryToASCII {

    private static String decodeBinary(String biner) {
        if (biner.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < biner.length(); i += 8) {
            String binerChar = biner.substring(i, i + 8);
            int nilaiDesimal = Integer.parseInt(binerChar, 2);
            char decodeChar = (char) nilaiDesimal;
            sb.append(decodeChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String biner = "0100100001000101010011000100110001001111";

        System.out.println(decodeBinary(biner));

    }
}





