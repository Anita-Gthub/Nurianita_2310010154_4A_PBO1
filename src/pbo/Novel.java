package pbo;

//Inheritance
public class Novel extends Buku {
    //Atribut dan Encapsulation
    private String penulis;

    //Constructor
    public Novel(String judul, String kode, int stok, double biayaSewa, String penulis) {
        super(judul, kode, stok, biayaSewa);
        this.penulis = penulis;
    }

    //Polymorphism (Overriding)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penulis: " + penulis);
    }
}