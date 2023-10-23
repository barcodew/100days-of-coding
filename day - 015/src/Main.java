import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashSet<String> dataMHS = new HashSet<>();

        String dataInput;
        while (!(dataInput = input.nextLine()).equalsIgnoreCase("Exit")) {

            if (dataMHS.contains(dataInput)) {
                System.out.println("Data Sudah Terdaftar!");
            } else {
                dataMHS.add(dataInput);
                System.out.println("Data Berhasil Ditambahkan!");
            }

        }
        System.out.println(dataMHS);
        
        input.close();
    }
}
