import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("D:\\Learning\\100 Days Of Coding\\day - 054\\src\\baca.text");

        try {
            String bacaFile = Files.readString(filePath);
            System.out.println(bacaFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
