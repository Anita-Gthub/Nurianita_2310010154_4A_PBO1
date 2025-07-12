package pbo;

//Inheritance
public class Komik extends Buku {
    //Atribut dan Encapsulation
    private String ilustrator;
    
    //Constructor
    public Komik(String judul, String kd_buku, int stok, double by_sewa, String ilustrator) {
        super(judul, kd_buku, stok, by_sewa);
        this.ilustrator = ilustrator;
    }

    //Polymorphism (Overriding)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ilustrator: " + ilustrator);
    }
}
