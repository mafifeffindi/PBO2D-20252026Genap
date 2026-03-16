package pekan5;
import java.util.Scanner;

abstract class Kendaraan {
    String nama;

    Kendaraan(String nama){
        this.nama = nama;
    }

    abstract void jalan();
}

class Mobil extends Kendaraan {

    private int kecepatan; // enkapsulasi

    Mobil(String nama, int kecepatan){
        super(nama); // keyword super
        this.kecepatan = kecepatan;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    @Override
    void jalan(){
        System.out.println(nama + " berjalan dengan kecepatan " + kecepatan + " km/jam");
    }

    // Inner Class
    class Mesin{
        void infoMesin(){
            System.out.println("Mesin mobil aktif");
        }
    }
}
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mobil: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kecepatan: ");
        int kecepatan = input.nextInt();

        Mobil m = new Mobil(nama, kecepatan);

        // Polimorfisme
        Kendaraan k = m;
        k.jalan();

        // Inner class
        Mobil.Mesin mesin = m.new Mesin();
        mesin.infoMesin();
    }
}
