public class InfinityForLoop {
    public static void main(String[] args) throws Exception {
        int i = 0;
        for (;;) {
            System.out.println(i++);
            if (i == 50) { // hapus ini jika ingin tanpa batas
                break;
            }
        }
    }
}
