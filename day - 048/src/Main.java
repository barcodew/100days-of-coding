import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arrayData = {12,3,4,24,5,12,2,4,5,6,7,8};

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data : ");
        int x = input.nextInt();

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i]==x) {
                System.out.println("index "+x+ " adalah : "+i);
            }
        }


    }
}
