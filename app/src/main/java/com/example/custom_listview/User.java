package com.example.custom_listview;

public class User {

    String nama, nim, email, angkatan, fakultas, prodi, semester, status;
    int imageId;

    public User(String name, String nim, String email, String angkatan, String fakultas, String prodi, String semester, String status, int imageId) {
        this.nama = name;
        this.nim = nim;
        this.email = email;
        this.angkatan = angkatan;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.semester = semester;
        this.status = status;
        this.imageId = imageId;
    }
}
