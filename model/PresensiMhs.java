package model;

import java.util.*;


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
