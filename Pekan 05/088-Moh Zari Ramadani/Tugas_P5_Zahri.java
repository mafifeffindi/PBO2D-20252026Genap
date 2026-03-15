package Tugas_P5_OOP_Zahri; // Java Packages

import java.util.ArrayList; // Java API

//  Encapsulation &  Abstraction
abstract class Person {
    private String nama;
    private String nim;

    public Person(String nama, String id) {
        this.nama = nama;
        this.nim = id;
    }
    public String getNama() {
        return nama;
    }

    public String getId() {
        return nim;
    }

    // Abstract Method 
    abstract void tugas();
}

// Inheritance 
class Siswa extends Person {

    public Siswa(String nama, String id) {
        // super Keyword
        super(nama, id);
    }

    // Polymorphism
    @Override
    void tugas() {
        System.out.println("Tugas: Mengikuti kegiatan belajar mengajar di kelas.");
    }

    // Inner Class
    class Rapor {
        void lihatNilai() {
            System.out.println("Siswa " + getNama() + " sedang melihat nilai semester di rapor.");
        }
    }
}

public class Tugas_P5_Zahri {
    public static void main(String[] args) {
        // Menggunakan Java API (ArrayList)
        ArrayList<Person> daftarSiswa = new ArrayList<>();

        // Objek Siswa
        Siswa s1 = new Siswa("Zahri Ramadani", "250631100088");
        
        daftarSiswa.add(s1);


        for (Person p : daftarSiswa) {
            System.out.println("Nama Siswa : " + p.getNama());
            System.out.println("NIM   : " + p.getId());
            p.tugas(); // Polymorphism
        }

        // Akses Inner Class
        Siswa.Rapor nilai = s1.new Rapor();
        nilai.lihatNilai();

        
    }
}
