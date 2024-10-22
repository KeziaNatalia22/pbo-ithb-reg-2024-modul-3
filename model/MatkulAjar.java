package model;

import java.util.*;

class MatkulNgajar {
    private Matkul matkul;
    private ArrayList<PresensiStaff> presensiStaffList;

    public MatkulNgajar(Matkul matkul, ArrayList<PresensiStaff> presensiStaffList) {
        this.matkul = matkul;
        this.presensiStaffList = presensiStaffList;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    @Override
    public String toString() {
        return "MataKuliah: " + matkul + "\nPresensi Staff: " + presensiStaffList;
    }
}