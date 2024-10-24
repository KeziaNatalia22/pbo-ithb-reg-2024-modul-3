package view;

import java.util.*;

import model.*;

public class main {
    public static void main(String[] args) {
        dummy();
    }

    public static void dummy(){
        ArrayList<PresensiMhs> presensiListMhs = new ArrayList<>();
        presensiListMhs.add(new PresensiMhs(new Date(), 1, "08:00"));  // Mahasiswa hadir jam 08:00
        presensiListMhs.add(new PresensiMhs(new Date(), 0, "10:00"));  // Mahasiswa tidak hadir, jam 10:00
        presensiListMhs.add(new PresensiMhs(new Date(), 1, "14:00"));  // Mahasiswa hadir jam 14:00

        ArrayList<PresensiStaff> presensiListStaff = new ArrayList<>();
        ArrayList<PresensiStaff> presensiListStaff2 = new ArrayList<>();
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "08:30"));  // Staff hadir jam 08:30
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "11:00"));  // Staff hadir jam 11:00
        presensiListStaff.add(new PresensiStaff(new Date(), 0, "15:00"));  // Staff tidak hadir, jam 15:00
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "08:45"));  // Staff hadir jam 08:30
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "09:15"));  // Staff hadir jam 09:15
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "10:00"));  // Staff hadir jam 10:00
        presensiListStaff.add(new PresensiStaff(new Date(), 0, "11:00"));  // Staff tidak hadir, jam 11:00
        presensiListStaff.add(new PresensiStaff(new Date(), 1, "12:00"));  // Staff hadir jam 12:00
        presensiListStaff.add(new PresensiStaff(new Date(), 0, "13:30"));  // Staff tidak hadir, jam 13:30
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "14:00"));  // Staff hadir jam 14:00
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "15:00"));  // Staff hadir jam 15:00
        presensiListStaff2.add(new PresensiStaff(new Date(), 0, "16:00"));  // Staff tidak hadir, jam 16:00
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "17:00"));  // Staff hadir jam 17:00
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "08:45"));  // Staff hadir jam 08:45
        presensiListStaff2.add(new PresensiStaff(new Date(), 0, "09:30"));  // Staff tidak hadir, jam 09:30
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "10:45"));  // Staff hadir jam 10:45
        presensiListStaff2.add(new PresensiStaff(new Date(), 0, "11:30"));  // Staff tidak hadir, jam 11:30
        presensiListStaff2.add(new PresensiStaff(new Date(), 1, "13:00"));  // Staff hadir jam 13:00
        presensiListStaff2.add(new PresensiStaff(new Date(), 0, "14:30"));  // Staff tidak hadir, jam 14:30

        ArrayList<PresensiMhs> presensiListMhs2 = new ArrayList<>();
        presensiListMhs2.add(new PresensiMhs(new Date(), 1, "07:30"));  // Mahasiswa hadir jam 07:30 (tepat waktu)
        presensiListMhs2.add(new PresensiMhs(new Date(), 1, "08:15"));  // Mahasiswa hadir jam 08:15 (terlambat)
        presensiListMhs2.add(new PresensiMhs(new Date(), 0, "09:00"));  // Mahasiswa tidak hadir
        presensiListMhs2.add(new PresensiMhs(new Date(), 1, "12:30"));  // Mahasiswa hadir jam 12:30 (siang)
        presensiListMhs2.add(new PresensiMhs(new Date(), 0, "15:00"));  // Mahasiswa tidak hadir jam 15:00
        
        // System.out.println(presensiListMhs2.toString());
        //Matkul Ambil
        MatkulAmbil matkulA1 = new MatkulAmbil("IF-001", 4, "Algoritma", presensiListMhs2, 80.1, 90.0, 100.0);
        MatkulAmbil matkulA2 = new MatkulAmbil("IF-002", 3, "Matvek", presensiListMhs, 79, 90.0, 100.0);
        MatkulAmbil matkulA3 = new MatkulAmbil("IF-003", 2, "Sisber", presensiListMhs2, 80.1, 40, 90);
        MatkulAmbil matkulA4 = new MatkulAmbil("IF-004", 1, "Prak Algo", presensiListMhs, 70, 90.0, 77.0);
        MatkulAmbil matkulA5 = new MatkulAmbil("IF-005", 4, "Basis Data", presensiListMhs2, 80.1, 90.0, 98.0);
        MatkulAmbil matkulA6 = new MatkulAmbil("IF-006", 3, "Jaringan Komputer", presensiListMhs, 85.0, 92.5, 88.0);
        MatkulAmbil matkulA7 = new MatkulAmbil("IF-007", 4, "Pengembangan Web", presensiListMhs2, 78.0, 85.0, 94.0);
        MatkulAmbil matkulA8 = new MatkulAmbil("IF-008", 2, "Analisis Algoritma", presensiListMhs, 82.0, 75.0, 89.0);
        MatkulAmbil matkulA9 = new MatkulAmbil("IF-009", 1, "Sistem Operasi", presensiListMhs2, 90.0, 88.0, 95.0);
        MatkulAmbil matkulA10 = new MatkulAmbil("IF-010", 3, "Kecerdasan Buatan", presensiListMhs, 88.5, 90.0, 92.0);
        MatkulAjar matkulA11 = new MatkulAjar("IF-011", 4, "Rekayasa Perangkat Lunak", presensiListStaff);
        MatkulAjar matkulA12 = new MatkulAjar("IF-012", 2, "Teori Graf", presensiListStaff);
        MatkulAjar matkulA13 = new MatkulAjar("IF-013", 1, "Statistika", presensiListStaff);
        MatkulAjar matkulA14 = new MatkulAjar("IF-014", 3, "Machine Learning", presensiListStaff);
        MatkulAjar matkulA15 = new MatkulAjar("IF-015", 4, "Mobile Programming", presensiListStaff);

        // System.out.println(matkulA1.toString());

        ArrayList<MatkulAmbil> matkul1 = new ArrayList<>();
        matkul1.add(matkulA1);
        matkul1.add(matkulA2);
        matkul1.add(matkulA3);
        matkul1.add(matkulA4);
        matkul1.add(matkulA5);
        
        ArrayList<MatkulAmbil> matkul2 = new ArrayList<>();
        matkul2.add(matkulA6);
        matkul2.add(matkulA7);
        matkul2.add(matkulA8);
        matkul2.add(matkulA9);
        matkul2.add(matkulA10);
        
        ArrayList<MatkulAjar> matkul3 = new ArrayList<>();
        matkul3.add(matkulA11);
        matkul3.add(matkulA12);
        matkul3.add(matkulA13);
        matkul3.add(matkulA14);
        matkul3.add(matkulA15);

        ArrayList<MatkulPilihan> matkul4 = new ArrayList<>();

        // Creating 5 dummy MatkulPilihan instances
        MatkulPilihan matkul11 = new MatkulPilihan("MP-001", 3, "Pemrograman Web", 5);
        MatkulPilihan matkul12 = new MatkulPilihan("MP-002", 4, "Kecerdasan Buatan", 6);
        MatkulPilihan matkul13 = new MatkulPilihan("MP-003", 2, "Pengembangan Aplikasi Mobile", 4);
        MatkulPilihan matkul14 = new MatkulPilihan("MP-004", 3, "Data Mining", 7);
        MatkulPilihan matkul15 = new MatkulPilihan("MP-005", 2, "Rekayasa Perangkat Lunak", 5);

        // Adding dummy instances to the list
        matkul4.add(matkul11);
        matkul4.add(matkul12);
        matkul4.add(matkul13);
        matkul4.add(matkul14);
        matkul4.add(matkul15);

        //Mahasiswa
        Mahasiswa MhsSarjana = new model.Sarjana("Kezia Natalia", "rumah", "Bandung, 22 Des 2004", "0829818928912", "Informatika", "1123001", matkul1);
        Mahasiswa MhsSarjana2 = new model.Sarjana("Pierre Yosefa", "begitulah...", "Tasik, 26 July 2004", "0829818928912", "Informatika", "1123001", matkul2);
        Mahasiswa MhsMagister = new model.Magister("Silvia Anggreni", "itulah", "Jakarta, 22 Des 2001", "0829818928912", "1103001", "Informatika", matkul2, "Kenapa Saya Cepat Pusing");
        Mahasiswa MhsDoktor = new model.Doktor("Dr. Siti", "Jl. Mawar No. 10", "1990-01-01", "08123456789", "D001", "Ilmu Komputer", "Optimasi Algoritma", 85, 90, 95);
        System.out.println(MhsSarjana.toString());
        System.out.println(MhsSarjana2.toString());
        System.out.println(MhsMagister.toString());
        System.out.println(MhsDoktor.toString());

        Staff DosenTetap = new model.DosenTetap("Inge Martina", "di rumahnya", "gatau", "111", "11111", "Teknik", matkul3, 5000000);
        Staff DosenHonorer = new model.DosenHonorer("Budi Santoso", "Jl. Kenanga No. 5", "1990-06-25", "089876543210", "22222", "Sistem Informasi", matkul3, 50000);
        Staff Karyawan = new model.Karyawan("Udin", "..", "...", "238819", "33333", 1000000, presensiListStaff2);
        System.out.println(DosenTetap.toString());
        System.out.println(DosenHonorer.toString());
        System.out.println(Karyawan.toString());
    }
}
