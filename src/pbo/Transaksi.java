package pbo;

//Class
public class Transaksi {
    public double hitungTotal(Buku buku, int hari) {
        return buku.getBy_sewa() * hari;
    }

    //Polymorphism (Overloading)
    public double hitungTotal(Buku buku, int hari, int jumlah) {
        //Seleksi (Percabangan)
        if (jumlah <= buku.getStok()) {
            return buku.getBy_sewa() * hari * jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
            return 0;
        }
    }
}
