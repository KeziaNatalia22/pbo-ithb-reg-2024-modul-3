class Mahasiswa extends User {
    String NIM, jurusan;
    public Mahasiswa(String nama, String alamat, String ttl, String telp){
        super(nama, alamat, ttl, telp);
    }
}

class Staff extends User {
    String NIK;
    public Staff(String nama, String alamat, String ttl, String telp, String NIK){
        super(nama, alamat, ttl, telp, this.NIK);
    }
}