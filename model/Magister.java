package model;

import java.util.*;

public class Magister extends Mahasiswa { // Modifier public ditambahkan
    private ArrayList<Matkul> matakuliah;
    private String judulPenelitianTesis;

    public String getJudulPenelitian() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitianTesis = judulPenelitian;
    }

    public ArrayList<Matkul> getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(ArrayList<Matkul> matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Magister(String nama, String alamat, String ttl, String telp, String NIM, String jurusan, ArrayList<Matkul> matakuliah, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telp, jurusan, NIM);
        this.matakuliah = matakuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatakuliah " + matakuliah;
    }
}

