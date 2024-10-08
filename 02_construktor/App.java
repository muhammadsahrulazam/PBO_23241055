// class Polos atau tanpa construktor
class Polos{
    // atribut objek 
    String dataString;
    int dataInteger;
}
 // class dengan construktor
 class mahasiswa{
    // atribut 
    String Nama;
    String Nim;
    String Prodi;

    //constructor
    // nama sama dengan nama class
    // tidak memiliki return velue/nilai balik
    // method yang pertama kali yang dipangill saat objek pertama kali dipanggil
    mahasiswa(String inputNama, String inputNim, String inputProdi){
    // mengisi data
    Nama = inputNama;
    Nim = inputNim;
    Prodi = inputProdi;

    // mencetak data 
    System.out.println("Nama Mahasiswa : " + Nama);
    System.out.println("Nim : " + Nim);
    System.out.println("Prodi : " + Prodi);

    }
 }


public class App {
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instasiasi objek 
        Polos polos_1 = new Polos();

        // isi atribut 
        polos_1.dataString = "Polos";
        polos_1.dataInteger = 10;

        // cetak objek 
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa
        mahasiswa mhs_1 = new mahasiswa("muhammad sahrul azam", "23241055", "PTI");
        mhs_1.Nama = "sahrul";
        System.out.println(mhs_1.Nama);

        //pembuatan objek mahasiswa 2
        mahasiswa mhs_2 = new mahasiswa("azam sahrul muhammad", "2324105555", "pti");

    
    
    }
 }
