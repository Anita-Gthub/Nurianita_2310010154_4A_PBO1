package pbo;

//Class
public class Member {
    //Atribut dan Encapsulation
    private String nama;
    private String id_member;

    //Constructor
    public Member(String nama, String id) {
        this.nama = nama;
        this.id_member = id;
    }

    //Accessor (getter)
    public String getNama() {
        return nama;
    }
    
    public String getId() {
        return id_member;
    }

    //method
    public void tampilkanInfo() {
        System.out.println("Nama Member: " + nama + ", ID: " + id_member);
    }
}
