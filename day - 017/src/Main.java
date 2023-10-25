
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void listMenu() {
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

        String[][] dataMHS = new String[100][5];

        dataMHS[0][0] = "NO";
        dataMHS[0][1] = "Kode MK";
        dataMHS[0][2] = "Matakuliah";
        dataMHS[0][3] = "SKS";
        dataMHS[0][4] = "Nilai";
        dataMHS[1][0] = "1";
        dataMHS[1][1] = "USB0812";
        dataMHS[1][2] = "Pendidikan Kewarganegaraan";
        dataMHS[1][3] = "2";
        dataMHS[1][4] = "A";
        dataMHS[2][0] = "2";
        dataMHS[2][1] = "INF082319";
        dataMHS[2][2] = "Algoritma dan Struktur Data";
        dataMHS[2][3] = "3";
        dataMHS[2][4] = "A";
        dataMHS[3][0] = "3";
        dataMHS[3][1] = "INF021319";
        dataMHS[3][2] = "Dasar Dasar Pemrograman";
        dataMHS[3][3] = "3";
        dataMHS[3][4] = "A";

        listMenu();
        int selectedMenu = input.nextInt();
        while (true) {
            if (selectedMenu == 1) {
                // create data

                for (int i = 0; i < dataMHS.length; i++) {
                    if (dataMHS[i][0] == null) {
                        int nomer = (int) i ;
                        String dummy = input.nextLine();
                        dataMHS[i][0] = Integer.toString(nomer);
                        System.out.print("Kode MK :");
                        dataMHS[i][1] = input.nextLine();
                        System.out.print("Matakuliah :");
                        dataMHS[i][2] = input.nextLine();
                        System.out.print("SKS :");
                        dataMHS[i][3] = input.nextLine();
                        System.out.print("Nilai :");
                        dataMHS[i][4] = input.nextLine();
                        System.out.print("Lanjut Menginput? (Y/n) :");
                        String lanjut = input.next();
                        if (lanjut.toLowerCase().contains("n")) {
                            break;

                        }
                    }
                }
            } else if (selectedMenu == 2) {
                // Read Data

                for (int i = 0; i < dataMHS.length; i++) {
                    if (dataMHS[i][0] != null) {
                        for (int j = 0; j < dataMHS[j][0].length(); j++) {
                            System.out.printf("%-8s%-15s%-35s%-10s%-10s%n", dataMHS[i][0], dataMHS[i][1], dataMHS[i][2],
                                    dataMHS[i][3], dataMHS[i][4]);

                        }
                    }
                }
            } else if (selectedMenu == 3) {
                System.out.println("Data keberapa yang ingin di ubah?");
                int ubahData = input.nextInt();
                String dummy = input.nextLine();
                dataMHS[ubahData][0] = Integer.toString(ubahData);
                System.out.print("Kode MK :");
                dataMHS[ubahData][1] = input.nextLine();
                System.out.print("Matakuliah :");
                dataMHS[ubahData][2] = input.nextLine();
                System.out.print("SKS :");
                dataMHS[ubahData][3] = input.nextLine();
                System.out.print("Nilai :");
                dataMHS[ubahData][4] = input.nextLine();
                System.out.println("Data berhasil diubah!");

            }else if (selectedMenu ==4) {
                System.out.println("Data keberapa yang ingin di Hapus?");
                int hapusData = input.nextInt();

                int totalData=0;

                for (int i = 0; i < dataMHS.length; i++) {
                    if (dataMHS[i][0]!=null) {
                        totalData++;
                    }
                }

                if (hapusData>totalData || totalData<=0) {
                    System.out.println("DATA TIDAK DITEMUKAN");
                } else {
                    for (int i = hapusData; i < totalData; i++) {
                    dataMHS[i][1] = dataMHS[i+1][1];
                    dataMHS[i][2] = dataMHS[i+1][2];
                    dataMHS[i][3] = dataMHS[i+1][3];
                    dataMHS[i][4] = dataMHS[i+1][4];

                }
                dataMHS[totalData-1][0]= null;
                System.out.println("Data berhasil hapus!");
                }
                
            } else if (selectedMenu == 5) {
                break;
            } else{
                System.out.println("Pilih menu dengan benar!");
            }

            listMenu();
            selectedMenu = input.nextInt();
        }
        System.out.print("Program Selesai, have a nice day!");

    }
}
