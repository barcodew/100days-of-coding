public class RGBtoHEX {

    private static int validasiNilai(int nilai) {
        return Math.min(255, Math.max(0, nilai));
    }

    private static String konversiToHex(int nilai) {
        String hexa = Integer.toHexString(nilai).toUpperCase();
        return hexa.length() == 1 ? "0" + hexa : hexa;
    }

    private static String rgb(int r, int g, int b) {
        r = validasiNilai(r);
        g = validasiNilai(g);
        b = validasiNilai(b);
        return konversiToHex(r) + konversiToHex(g) + konversiToHex(b);

    }

    public static void main(String[] args) throws Exception {
        System.out.println(rgb(123, 123, 123));
    }
}
