public class DisplayLikeSosmed {

    private static String whoLikes(String[] names) {
        String result = "";
        if (names == null || names.length ==0) {
            result = "no one likes this";
        } else if (names.length == 2) {
            result = names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (names.length >= 4) {
            int sisaOrang = names.length - 2;
            result = names[0] + ", " + names[1] + " and " + sisaOrang + " others like this";
        } else if (names.length == 1) {
            result = names[0]+" like this";
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String[] dataOrang = {};

        System.out.println(whoLikes(dataOrang));
    }
}
