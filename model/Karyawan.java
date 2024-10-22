package model;

import java.util.*;

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
