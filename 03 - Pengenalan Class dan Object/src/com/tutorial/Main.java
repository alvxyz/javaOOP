package com.tutorial;

// Membuat class sebagai template

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
     
}

public class Main {

    public static void main(String[] args) throws Exception{ 

        // instansiasi / membuat Object

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup Sujiman";
        mahasiswa1.NIM = "3201816023";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        System.out.println();


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Bergas Numero";
        mahasiswa2.NIM = "3201816024";
        mahasiswa2.jurusan = "Teknik Listrik";
        mahasiswa2.IPK = 3.2;
        mahasiswa2.umur = 20;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}

