package model;

import java.util.*;

abstract class Matkul {
    private String kodeMatkul;
    private int sks;
    private String namaMatkul;

    public Matkul(String kodeMatkul, int sks, String namaMatkul) {
        this.kodeMatkul = kodeMatkul;
        this.sks = sks;
        this.namaMatkul = namaMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    @Override
    public String toString() {
        return "Kode Matkul: " + kodeMatkul + "\nNama Matkul: " + namaMatkul + "\nSKS: " + sks;
    }
}

class MatkulPilihan extends Matkul {
    private int jmlMinimumMhs;

    public MatkulPilihan(String kodeMatkul, int sks, String namaMatkul, int jmlMinimumMhs) {
        super(kodeMatkul, sks, namaMatkul);
        this.jmlMinimumMhs = jmlMinimumMhs;
    }

    public int getJmlMinimumMhs() {
        return jmlMinimumMhs;
    }

    public void setJmlMinimumMhs(int jmlMinimumMhs) {
        this.jmlMinimumMhs = jmlMinimumMhs;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinimum Mahasiswa: " + jmlMinimumMhs;
    }
}

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

class MatkulNgajar {
    private Matkul matkul;
    private List<PresensiStaff> presensiStaffList;

    public MatkulNgajar(Matkul matkul, List<PresensiStaff> presensiStaffList) {
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

class Presensi {
    private Date tanggal;
    private int status;

    public Presensi(Date tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status;
    }
}

class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(Date tanggal, int status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam: " + jam;
    }
}

class PresensiMhs extends Presensi {
    private String jam;

    public PresensiMhs(Date tanggal, int status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam: " + jam;
    }
}
