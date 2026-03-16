package pekan05;

// Abstraksi
abstract class Buku {
    String judul;

    Buku(String judul){
        this.judul = judul;
    }
    abstract void info();
}
// Inheritance
class BukuPelajaran extends Buku {

    BukuPelajaran(String judul){
        super(judul); // penggunaan super
    }
    // Polimorfisme
    @Override
    void info(){
        System.out.println("Buku yang dibaca : " + judul);
    }
}
// Enkapsulasi
class DataBuku {
    private int tahun;

    public void setTahun(int tahun){
        this.tahun = tahun;
    }

    public int getTahun(){
        return tahun;
    }
}
// Inner Class
class Perpustakaan {

    class Rak {
        void tampil(){
            System.out.println("Buku berada di rak perpustakaan");
        }
    }
}
// Main Program
public class MainProgram {
    public static void main(String[] args){

        Buku b = new BukuPelajaran("Pemrograman Java");
        b.info();

        DataBuku d = new DataBuku();
        d.setTahun(2025);
        System.out.println("Tahun buku: " + d.getTahun());

        Perpustakaan p = new Perpustakaan();
        Perpustakaan.Rak r = p.new Rak();
        r.tampil();
    }
}
