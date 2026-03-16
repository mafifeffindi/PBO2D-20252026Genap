import java.util.Scanner;

abstract class Buku {
    private String judul;
    private String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    abstract void displayInfo();
}

class Novel extends Buku {

    private String genre;

    public Novel(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }

    @Override
    void displayInfo() {
        System.out.println("Judul Buku : " + getJudul());
        System.out.println("Pengarang  : " + getPengarang());
        System.out.println("Genre      : " + genre);
    }

    class Review {
        void tampilReview() {
            System.out.println("Review: Novel ini menarik untuk dibaca.");
        }
    }
}

public class TugasPekan5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Judul Buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan Pengarang: ");
        String pengarang = input.nextLine();

        System.out.print("Masukkan Genre: ");
        String genre = input.nextLine();

        Novel n1 = new Novel(judul, pengarang, genre);

        System.out.println("\nData Buku:");
        n1.displayInfo();

        Novel.Review r = n1.new Review();
        r.tampilReview();
    }
}