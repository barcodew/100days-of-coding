import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("src\\baca.txt");

        try {
            String bacaFile = Files.readString(filePath);
            System.out.println(bacaFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String isiKanFile = "Ini Isi File Setelah Dibaca!";

        try {
            Files.writeString(filePath, isiKanFile);
            System.out.println("File Berhasil Update!");
        } catch (Exception e) {
            System.out.println("GAGAL MENGUPDATE!");
        }
    }
}
