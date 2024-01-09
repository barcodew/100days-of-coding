public class CreatingPhoneNumber {

    private static String createPhoneNumber(int[] numbers) throws Exception {

        if (numbers.length != 10) {
            throw new Exception("Array Harus Bernilai 0 - 9");
        }

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2], numbers[3],
                numbers[4], numbers[5], numbers[6], numbers[7],
                numbers[8], numbers[9]);
    }

    public static void main(String[] args) throws Exception {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        System.out.println(createPhoneNumber(numbers));

    }
}
