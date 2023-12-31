public class CamelCaseBreaker {

    public static String breakCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(" ").append(ch);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "camelCasing";
        System.out.println(breakCamelCase(input1));  

        String input2 = "identifier";
        System.out.println(breakCamelCase(input2)); 

    }
}
