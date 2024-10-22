package model;

import java.util.*;

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