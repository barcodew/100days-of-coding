
public class Main {
    String namaDepan,namaBelakang;

    public Main(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void intro(){
        System.out.println("Nama Lengkap : "+namaDepan+namaBelakang);
    }

     class sapaOrang{
        String namaPanggilan;

        public sapaOrang(String namaPanggilan) {
            this.namaPanggilan = namaPanggilan;
        }

        public void sapa(){
            System.out.println("Halo , "+namaPanggilan);
        }

        
    }

    class selamatTinggal{
        String namaDIA;

        public selamatTinggal(String namaDIA) {
            this.namaDIA = namaDIA;
        }

        public void bye(){
            System.out.println("Selamat Tinggal "+namaDIA);
        }
    }


    public static void main(String[] args) {
        Main outerClass = new Main("Achmad Ali ", "Akbar");
        outerClass.intro();

        Main.sapaOrang innerClass1 = outerClass.new sapaOrang("Akbar");
        innerClass1.sapa();

        Main.selamatTinggal innerClass2 = outerClass.new selamatTinggal("Kamu");
        innerClass2.bye();
    }

    


}
