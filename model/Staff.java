package model;

import java.util.*;

abstract class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, String ttl, String telepon, String NIK) {
        super(nama, alamat, ttl, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + NIK;
    }
}

class Dosen extends Staff {
    private String departemen;
    private List<MatkulNgajar> matkulAjarList;
    
    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<MatkulNgajar> matkulAjarList) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.matkulAjarList = matkulAjarList;
    }
    
    public List<MatkulNgajar> getMatkulAjarList() {
        return matkulAjarList;
    }

    public void setMatkulAjarList(List<MatkulNgajar> matkulAjarList) {
        this.matkulAjarList = matkulAjarList;
    }

    public String getDepartemen() { 
        return departemen; 
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen + "\nMatkul Ajar: " + matkulAjarList;
    }
}


