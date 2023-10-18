import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class variabelGenerator {
    public static void main(String[] args) {

        try {
            String namaClass = "OutputThisProgram";
            StringBuffer sb = new StringBuffer();
            sb.append("public class "+namaClass+"{\n");

            String[] tipeData = {"int","byte","short","long","float","double","boolean","char","Integer"}; // silahkan menambahkan tipe data lainnya
            sb.append("//variabel instant\n");

            for (int i = 1; i <=100; i++) {
                int indexTD = i %tipeData.length;

                sb.append(tipeData[indexTD]+" varInstance"+(i+1)+";\n");
            }
            sb.append("}");

            File f = new File("D:\\Learning\\100 Days Of Coding\\day - 011\\src\\"+namaClass + ".java"); // ubah path sesuai dengan folder projectmu
            Files.writeString(f.toPath(), sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
