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




abstract class Presensi {
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
