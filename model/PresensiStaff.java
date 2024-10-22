package model;

import java.util.*;

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