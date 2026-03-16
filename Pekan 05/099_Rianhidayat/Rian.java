1. java Encapsulation
class Mahasiswa {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
}

public class MainEncapsulation {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNama("Budi");
        m.setUmur(20);

        System.out.println("Nama: " + m.getNama());
        System.out.println("Umur: " + m.getUmur());
    }
}


2. Java Packages
 import java.util.Scanner; // API

public class MainPackage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("Halo " + nama);
    }
}

3. Java inheritance
  class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong");
    }
}

public class MainInheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan();
        k.suara();
    }
}

4.Java Polymorphism
  class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk guk");
    }
}

public class MainPolymorphism {
    public static void main(String[] args) {
        Hewan h = new Anjing();
        h.suara();
    }
}

5. Super Keyword
  class Orang {
    String nama = "Parent";

    Orang() {
        System.out.println("Constructor Parent");
    }
}

class Mahasiswa extends Orang {
    String nama = "Child";

    Mahasiswa() {
        super();
        System.out.println("Constructor Child");
        System.out.println("Nama Parent: " + super.nama);
    }
}

public class MainSuper {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
    }
}

6. Inner Classes
  class Luar {
    class Dalam {
        void tampil() {
            System.out.println("Ini Inner Class");
        }
    }
}

public class MainInner {
    public static void main(String[] args) {
        Luar luar = new Luar();
        Luar.Dalam dalam = luar.new Dalam();
        dalam.tampil();
    }
}

7. Abstraction
  abstract class Kendaraan {
    abstract void jalan();
}

class Mobil extends Kendaraan {
    void jalan() {
        System.out.println("Mobil berjalan");
    }
}

public class MainAbstraction {
    public static void main(String[] args) {
        Kendaraan k = new Mobil();
        k.jalan();
    }
}
