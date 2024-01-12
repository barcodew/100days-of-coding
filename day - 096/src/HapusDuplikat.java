
public class HapusDuplikat {
    public static String[] checkDup(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = mengHapuString(arr[i]);
        }

        return result;
    }

    private static String mengHapuString(String str) {
        StringBuilder result = new StringBuilder();
        char charSebelum = '\0'; // Karakter sebelumnya, awalnya diatur sebagai karakter nol

        for (char charSekarang : str.toCharArray()) {
            // Menambahkan karakter ke hasil hanya jika berbeda dengan karakter sebelumnya
            if (charSekarang != charSebelum) {
                result.append(charSekarang);
                charSebelum = charSekarang;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] array1 = {"abracadabra", "allottee", "assessee"};
        String[] array2 = {"kelless", "keenness"};

        String[] result1 = checkDup(array1);
        String[] result2 = checkDup(array2);

        System.out.println("Array 1 - Hasil: " + String.join(", ", result1));
        System.out.println("Array 2 - Hasil: " + String.join(", ", result2));
    }
}
