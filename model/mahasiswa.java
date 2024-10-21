package model;

import java.util.*;

abstract class Mahasiswa extends User{
    private String NIM, jurusan;

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    public Mahasiswa(String nama, String alamat, String ttl, String telp, String jurusan, String NIM) {
        super(nama, alamat, ttl, telp);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }  

    @Override 
    public String toString (){
        return super.toString() + "\nNIM : " + NIM + "\nJurusan : " + jurusan;
    }
}

class Sarjana extends Mahasiswa {
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
class Magister extends Mahasiswa {
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

    public Magister(String nama, String alamat, String ttl, String telp, String NIM,  String jurusan, ArrayList<Matkul> matakuliah, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telp, jurusan, NIM);
        this.matakuliah = matakuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }  

    @Override
    public String toString(){
        return super.toString() + "\nMatakuliah " + matakuliah;
    }
}
class Doktor extends Mahasiswa {
    private String judulPenelitianDisertasi;
    private int ns1, ns2, ns3;

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getNs1() {
        return ns1;
    }

    public void setNs1(int ns1) {
        this.ns1 = ns1;
    }

    public int getNs2() {
        return ns2;
    }

    public void setNs2(int ns2) {
        this.ns2 = ns2;
    }

    public int getNs3() {
        return ns3;
    }

    public void setNs3(int ns3) {
        this.ns3 = ns3;
    }

    public Doktor(String nama, String alamat, String ttl, String telp, String NIM, String jurusan,String judulPenelitianDisertasi, int ns1, int ns2, int ns3) {
        super(nama, alamat, ttl, telp, jurusan, NIM);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.ns1 = ns1;
        this.ns2 = ns2;
        this.ns3 = ns3;
    }  

    @Override
    public String toString(){
        return super.toString() + "\nJudul Peneltitian Disertasi : " + judulPenelitianDisertasi + "\nNilai Sidang 1 : " + ns1 + "\nNilai Sidang 2 : " + ns2  + "\nNilai Sidang 3 : " + ns3;
    }
}

public class mahasiswa {
    public static void main(String[] args) {
        
    }
}
