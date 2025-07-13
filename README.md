# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi peminjaman buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk melihat daftar buku, memilih buku untuk disewa, memasukkan jumlah hari dan jumlah buku yang ingin disewa, dan menampilkan total biaya sewa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `Komik`, `Novel`, `Member`, `Transaksi`, `Rental` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class Komik extends Buku {
    ...
}

public class Novel extends Buku {
    ...
}

public class Member {
    ...
}

public class Transaksi {
    ...
}

public class Rental {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Buku[] daftarBuku = {new Komik(...), new Novel(...)};`, `Member[] daftarMember = {new Member(...)};` dan `Transaksi transaksi = new Transaksi();` adalah contoh pembuatan object dalam class Rental.

```bash
Buku[] daftarBuku = {new Komik(...), new Novel(...)};
Member[] daftarMember = {new Member(...)};
Transaksi transaksi = new Transaksi();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, `kd_buku`, `stok`, `by_sewa`, `ilustrator`, `penulis`, `nama` dan `id_member` adalah contoh atribut.

```bash
private String judul;
private String kd_buku;
private int stok;
private double by_sewa;
private String ilustrator;
private String penulis;
private String nama;
private String id_member;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku`, `Komik`, `Novel` dan `Member`.

```bash
public Buku(String judul, String kd_buku, int stok, double by_sewa) {
        this.judul = judul;
        this.kd_buku = kd_buku;
        this.stok = stok;
        this.by_sewa = by_sewa;
    }

public Komik(String judul, String kd_buku, int stok, double by_sewa, String ilustrator) {
        super(judul, kd_buku, stok, by_sewa);
        this.ilustrator = ilustrator;
    }

public Novel(String judul, String kode, int stok, double biayaSewa, String penulis) {
        super(judul, kode, stok, biayaSewa);
        this.penulis = penulis;
    }

public Member(String nama, String id) {
        this.nama = nama;
        this.id_member = id;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setStok`adalah contoh method mutator.

```bash
public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getStok`, `getBy_sewa`, `getNama` dan `getId` adalah contoh method accessor.

```bash
public String getJudul() {
  return judul;
}

public int getStok() {
  return stok;
}

public double getBy_sewa() {
  return by_sewa;
}

public String getNama() {
  return nama;
}
    
public String getId() {
  return id_member;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul`, `kd_buku`, `stok`, `by_sewa`, `ilustrator`, `penulis`, `nama` dan `id_member` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul;
private String kd_buku;
private int stok;
private double by_sewa;
private String ilustrator;
private String penulis;
private String nama;
private String id_member;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini,`Komik` dan `Novel` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class Komik extends Buku {
    ...
}

public class Novel extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `hitungTotal()` di `Transaksi` merupakan overloading method `hitungTotal` dan ``tampilkanInfo()`` di `Komik` dan `Novel` merupakan override dari method `tampilkanInfo` di `Komik` dan `Novel`.

```bash
public double hitungTotal(Buku buku, int hari) {
    ...
}
public double hitungTotal(Buku buku, int hari, int jumlah) {
    ...
}

@Override
public void tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` di setter dan validasi input di `Rental.java`.

```bash
if (jumlah <= buku.getStok()) {
      return buku.getBy_sewa() * hari * jumlah;
      } else {
  System.out.println("Stok tidak mencukupi!");
      return 0;
  }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarBuku.length; i++) {
    System.out.print("[" + i + "] ");
    daftarBuku[i].tampilkanInfo();
    System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
    System.out.println("Masukkan indeks buku yang ingin disewa: ");
    System.out.println("Masukkan jumlah hari sewa: ");
    System.out.println("Masukkan jumlah buku yang disewa: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Buku[] daftarBuku = new Buku[2];` dan `Member[] daftarMember = new Member[2];` adalah contoh penggunaan array.

```bash
Buku[] daftarBuku = new Buku[2];
Member[] daftarMember = new Member[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
Try {
    ...
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Masukkan angka yang benar!");
    } catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nurianita  
NPM: 2310010154  
Kelas: 4A
