import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;

public class ShortCutAPP {

    static void menu() {
        System.out.println("-------------------------");
        System.out.println("[1] Chrome");
        System.out.println("[2] Adobe Acrobat");
        System.out.println("[3] Adobe Photoshop");
        System.out.println("[0] Exit ");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String fileLocation = "";
        boolean statusProgram = true;
        while (statusProgram) {
            menu();
            int selectMenu = input.nextInt();

            switch (selectMenu) {
                case 1:
                    fileLocation = "c:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome.lnk";
                    break;
                case 2:
                    fileLocation = "C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe";
                    break;
                case 3:
                    fileLocation = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Adobe Photoshop CS6 (64 Bit).lnk";
                    break;
                case 4:
                    statusProgram = false;
                    break;
                default:
                    System.out.println("Select Menu!");
                    break;
            }

            File aplikasi = new File(fileLocation);

            if (aplikasi.exists() && Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(aplikasi);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(" Aplikasi tidak ditemukan / tidak support!");
            }

        }
    }
}
