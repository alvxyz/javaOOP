package com.tutorial;

// class tanpa konstruktor
class Polos {
    String dataString;
    int dataInt;
}

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    int operan1;
    int operan2;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return this.jurusan;
    } 

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getOperan1() {
        return this.operan1;
    }

    public void setOperan1(int operan1) {
        this.operan1 = operan1;
    }

    public int getOperan2() {
        return this.operan2;
    }

    public void setOperan2(int operan2) {
        this.operan2 = operan2;
    }

    // Konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        this.nama = inputNama;
        this.NIM = inputNIM;
        this.jurusan = inputJurusan;

        System.out.println("Ini adalah Konstruktor");
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }

    // konstruktor tanpa parameter
    Mahasiswa() {
        System.out.println("Konstruktor Kosong");
    }

    // membuat method perhitungan
    int PerhitunganPenjumlahan(int inputOperan1, int inputOperan2) {
        operan1 = inputOperan1;
        operan2 = inputOperan2;

        int hasil = operan1 + operan2;

        return hasil;

    }

    boolean cekBulatGanjil(int inputOperan1, int inputOperan2) {
        operan1 = inputOperan1;
        operan2 = inputOperan2;
        boolean hasil;

        if (operan1 % operan2 == 0) {
            hasil = true;
        } else {
            hasil = false;
        }	
        return hasil;
    }
    
}

public class Main {

    public static void main(String[] args) throws Exception {
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInt = 4;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInt);

        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "16544654564", "Teknik Perteknikan");

        Mahasiswa mahasiswa2 = new Mahasiswa("Yuri", "4654846545", "Teknik Elektro");

        System.out.println(mahasiswa1.PerhitunganPenjumlahan(3, 4));

        System.out.println(mahasiswa2.cekBulatGanjil(10, 3));

    }

}