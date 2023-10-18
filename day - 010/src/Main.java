import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );

        System.out.print("Masukkan Nilai a : ");
        double a = input.nextDouble();
        System.out.print("Masukkan Nilai b : ");
        double b = input.nextDouble();
        System.out.print("Masukkan Nilai c : ");
        double c = input.nextDouble();
        System.out.print("Masukkan Nilai d : ");
        double d = input.nextDouble();
        System.out.print("Masukkan Nilai e : ");
        double e = input.nextDouble(); 

        double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
    }
    
}
