import java.util.Arrays;
import java.util.Scanner;

// CRUD DATA MAHASISWA SEDERHANA

public class main {

    static void listMenu() {
        System.out.println("--------------------------------");
        System.out.println("-- Made With Love By Barcodew --");
        System.out.println("--------------------------------");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataMHS = new String[100][4];
        int indexMhs = 0;

        listMenu();
        int selectedMenu = input.nextInt();
        while (true) {
            if (selectedMenu == 1) {
                while (indexMhs < dataMHS.length) {
                    String dummy = input.nextLine();
                    System.out.print("Nama \t: ");
                    dataMHS[indexMhs][0] = input.nextLine();
                    System.out.print("Nim \t: ");
                    dataMHS[indexMhs][1] = input.nextLine();
                    System.out.print("Kelas \t: ");
                    dataMHS[indexMhs][2] = input.nextLine();
                    System.out.print("Jurusan : ");
                    dataMHS[indexMhs][3] = input.nextLine();
                    indexMhs++;

                    System.out.println("Ingin Menambah input? ");
                    String lanjutan = input.next();
                    if (lanjutan.contains("n") || lanjutan.contains("N")) {
                        break;
                    }
                }

            } else if (selectedMenu == 2) {
                for (int i = 0; i < dataMHS.length; i++) {
                    if (dataMHS[i][0] != null) {
                        int indexData = dataMHS.length - 99 + i;
                        System.out.println("----------------------");
                        System.out.println("Data ke - " + indexData);
                        System.out.println("Nama \t:" + dataMHS[i][0]);
                        System.out.println("Nim \t:" + dataMHS[i][1]);
                        System.out.println("Kelas \t:" + dataMHS[i][2]);
                        System.out.println("Jurusan :" + dataMHS[i][3]);
                        System.out.println("----------------------");
                    }
                }

            } else if (selectedMenu == 3) {
                System.out.println("Data Keberapa Yang ingin di ubah ?");

                int ubahInIndex = input.nextInt();
                String dummy = input.nextLine();
                System.out.print("Nama \t: ");
                dataMHS[ubahInIndex - 1][0] = input.nextLine();
                System.out.print("Nim \t: ");
                dataMHS[ubahInIndex - 1][1] = input.nextLine();
                System.out.print("Kelas \t: ");
                dataMHS[ubahInIndex - 1][2] = input.nextLine();
                System.out.print("Jurusan : ");
                dataMHS[ubahInIndex - 1][3] = input.nextLine();

                System.out.println("Data Berhasil Di Ubah!");

            } else if (selectedMenu == 4) {
                System.out.println("Data Keberapa Yang ingin di Hapus ?");

                int ubahInIndex = input.nextInt();
                String dummy = input.nextLine();
                System.out.print("Nama \t: ");
                dataMHS[ubahInIndex - 1][0] = null;
                System.out.print("Nim \t: ");
                dataMHS[ubahInIndex - 1][1] = null;
                System.out.print("Kelas \t: ");
                dataMHS[ubahInIndex - 1][2] = null;
                System.out.print("Jurusan : ");
                dataMHS[ubahInIndex - 1][3] = null;
                System.out.println("Data Berhasil Di Hapus!");
            } else if (selectedMenu == 5) {
                break;
            }

            listMenu();
            selectedMenu = input.nextInt();

        }
        System.out.println("Program Selesai!");
        System.out.println("Have a nice day ^__^");

    }
}
