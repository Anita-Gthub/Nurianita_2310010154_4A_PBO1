package pbo;

//Class
public class Buku {
    //Atribut dan Encapsulation
    private String judul, kd_buku;
    private int stok;
    private double by_sewa;
    
    //Constructor
    public Buku(String judul, String kd_buku, int stok, double by_sewa) {
        this.judul = judul;
        this.kd_buku = kd_buku;
        this.stok = stok;
        this.by_sewa = by_sewa;
    }

    //Accessor (getter)
    public String getJudul() {
        return judul;
    }

    public int getStok() {
        return stok;
    }

    public double getBy_sewa() {
        return by_sewa;
    }
    
    //Mutator
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }
    
    //Polymorphism - akan dioverride
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Kode: " + kd_buku + ", Stok: " + stok + ", Biaya Sewa: " + by_sewa);
    }
}
