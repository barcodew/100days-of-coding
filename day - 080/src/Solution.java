import java.util.Scanner;

public class Solution {

    public static int solution(int number){
        int totalSum = 0;

        for (int i = 0; i < number; i++) {
            if (i%3==0 || i%5 ==0) {
                totalSum +=i;
            }
        }

        return totalSum;

    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println(solution(number));
        input.close();
    }
}
