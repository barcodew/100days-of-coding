import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int sisi = input.nextInt();

        int [] data = new int[sisi];

        for (int i = 0 ; i<sisi;i++){
            data[i] = input.nextInt();
        }
        if (sisi>0 ){
            int max = 0 ;
            for (int i = 0;i<sisi;i++){
                int panjang = data[i];

                max = Math.max(max, panjang);

                // polla +---+
                System.out.print("+");
                if( panjang > 0){
                    for (int j =0 ;j<max;j++){
                        System.out.print("---+");
                    }
                }
                System.out.println();

                // pola |   |

                System.out.print("|");
                if (panjang>0){
                    for(int j = 0 ;j<panjang;j++){
                        System.out.print("   |");
                    }
                }
                System.out.println();

            }

            System.out.print("+");
            for (int j = 0;j<max;j++){
                System.out.print("---+");
            }
            System.out.println();
        }        
    }
}
