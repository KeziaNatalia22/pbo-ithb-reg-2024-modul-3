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

class DosenTetap extends Dosen {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<MatkulNgajar> matkulAjarList, double salary) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkulAjarList);
        this.salary = salary;
    }
}

class DosenHonorer extends Dosen {
    private double hororPerSKS;

    public double getHororPerSKS() {
        return hororPerSKS;
    }

    public void setHororPerSKS(double hororPerSKS) {
        this.hororPerSKS = hororPerSKS;
    }

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, List<MatkulNgajar> matkulAjarList, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, departemen, matkulAjarList);
        this.hororPerSKS = honorPerSKS;
    }
}

class Karyawan extends Staff {
    private double salary;
    private List<PresensiStaff> presensiStaffList;

    
    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, double salary, List<PresensiStaff> presensiStaffList) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensiStaffList = presensiStaffList;
    }
    
    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) {
        this.presensiStaffList = presensiStaffList;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { 
        this.salary = salary; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nPresensi Staff: " + presensiStaffList;
    }
}

