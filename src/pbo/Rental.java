package pbo;

import java.util.InputMismatchException;
import java.util.Scanner;

//Class
public class Rental {

    public static void main(String[] args) {

        //Object dan Array
        Buku[] daftarBuku = {
            new Komik("One Piece", "K001", 3, 5000, "Eiichiro Oda"),
            new Novel("Laskar Pelangi", "N001", 2, 6000, "Andrea Hirata")
        };

        Member[] daftarMember = {
            new Member("Habibie", "M001"),
            new Member("Aina", "M002")
        };

        Transaksi transaksi = new Transaksi();

        //Perulangan
        System.out.println("=== DAFTAR BUKU ===");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.print("[" + i + "] ");
            daftarBuku[i].tampilkanInfo();
            System.out.println();
        }

        //IO Sederhana
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan indeks buku yang ingin disewa: ");
            int index = input.nextInt();

            System.out.println("Masukkan jumlah hari sewa: ");
            int hari = input.nextInt();

            System.out.println("Masukkan jumlah buku yang disewa: ");
            int jumlah = input.nextInt();

            //Error Handling
            if (index >= 0 && index < daftarBuku.length) {
                double total = transaksi.hitungTotal(daftarBuku[index], hari, jumlah);
                System.out.println("Total Sewa: Rp " + total);
            } else {
                System.out.println("Indeks buku tidak valid!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
