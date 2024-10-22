package model;


public abstract class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, String ttl, String telepon, String NIK) {
        super(nama, alamat, ttl, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + NIK;
    }
}




