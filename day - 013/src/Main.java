import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashSet<String> nimSet = new HashSet<>();

        nimSet.add("D0222320");
        nimSet.add("D0222321");
        nimSet.add("D0222322");
        nimSet.add("D0222323");
        nimSet.add("D0222324");

        String findNIM = input.nextLine();
        if (nimSet.contains(findNIM)) {
            System.out.println("NIM " + findNIM + " ditemukan dalam HashSet.");
        } else {
            System.out.println("NIM " + findNIM + " tidak ditemukan dalam HashSet.");
        }

        System.out.println("NIM-NIM dalam HashSet:");

        Iterator<String> iterator = nimSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
