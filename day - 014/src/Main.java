
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        double[] dataArray = {
                91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
                27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
                53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
        };

        Vector<Double> dataVector = new Vector<Double>();

        for (int i = 0; i < dataArray.length; i++) {
            dataVector.add(dataArray[i]);
        }

        System.out.println(dataVector);

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < dataVector.size(); i++) {
            double tempData = (double) dataVector.get(i);
            if (tempData < min) {
                min = tempData;
            }
            if (tempData > max) {
                max = tempData;
            }
            sum += tempData;

        }

        double countAVG = sum / dataVector.size();
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
        System.out.println("SUM : " + sum);
        System.out.println("AVG : " + countAVG);

    }
}
