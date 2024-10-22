package model;

import java.util.*;

class MatkulAmbil {
    private Matkul matkul;
    private List<Presensi> presensiList;
    private double n1, n2, n3;

    public MatkulAmbil(Matkul matkul, List<Presensi> presensiList, double n1, double n2, double n3) {
        this.matkul = matkul;
        this.presensiList = presensiList;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public List<Presensi> getPresensiList() {
        return presensiList;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    @Override
    public String toString() {
        return matkul.toString() + "\nNilai Ujian 1: " + n1 + "\nNilai Ujian 2: " + n2 + "\nNilai Ujian 3: " + n3
                + "\nPresensi: " + presensiList;
    }
}
