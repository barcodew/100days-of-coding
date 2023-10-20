import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string yang ingin di-reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("String yang di-reverse: " + reversed);
    }

}
