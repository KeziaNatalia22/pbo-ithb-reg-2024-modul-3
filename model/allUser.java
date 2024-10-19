package model;

import java.util.*;

class MSarjana extends User {
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    } 

    public MSarjana(String nama, String alamat, String ttl, String telp) {
        super(nama, alamat, ttl, telp);
    }  
}
class MMagister extends User {
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    } 

    public MMagister(String nama, String alamat, String ttl, String telp) {
        super(nama, alamat, ttl, telp);
    } 
}
class MDoktor extends User {
    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    } 

    public MDoktor(String nama, String alamat, String ttl, String telp) {
        super(nama, alamat, ttl, telp);
    } 
}

class Staff extends User {
    private String NIK;


    public Staff(String nama, String alamat, String ttl, String telp) {
        super(nama, alamat, ttl, telp);
    }

    public String getNIK() {
        return NIK;
    }


    public void setNIK(String nIK) {
        NIK = nIK;
    }



}

class Dosen extends Staff {
    private String departemen;
    private ArrayList<String> ListMatkul = new ArrayList<String>();

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<String> getListMatkul() {
        return ListMatkul;
    }

    public void setListMatkul(ArrayList<String> listMatkul) {
        ListMatkul = listMatkul;
    }

    public Dosen(String nama, String alamat, String ttl, String telp, String departemen, ArrayList<String> listMatkul) {
        super(nama, alamat, ttl, telp);
    }
}

public class allUser {
    public static void main(String[] args) {
        
    }
}
