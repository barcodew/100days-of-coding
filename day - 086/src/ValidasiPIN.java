public class ValidasiPIN {

    public static void main(String[] args) {
        String pin1 = "1234";
        String pin2 = "12345";
        String pin3 = "123456";
        String pin4 = "12a4";

        System.out.println(validasiPIN(pin1)); // true
        System.out.println(validasiPIN(pin2)); // false
        System.out.println(validasiPIN(pin3)); // true
        System.out.println(validasiPIN(pin4)); // false
    }

    static boolean validasiPIN(String pin) {
        int panjangPIN = pin.length();

        if (panjangPIN == 4 || panjangPIN == 6) {
            for (int i = 0; i < panjangPIN; i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }
            return true; 
        } else {
            return false; 
        }
    }
}
