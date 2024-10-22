package model;

import java.util.*;

public class Sarjana extends Mahasiswa { // Modifier public ditambahkan
    private ArrayList<Matkul> matakuliah;

    public ArrayList<Matkul> getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(ArrayList<Matkul> matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Sarjana(String nama, String alamat, String ttl, String telp, String jurusan, String NIM, ArrayList<Matkul> matakuliah) {
        super(nama, alamat, ttl, telp, jurusan, NIM);
        this.matakuliah = matakuliah;
    }

    @Override
    public String toString() {
        return super.toString() + "Matkul: " + matakuliah;
    }
}