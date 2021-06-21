package peminjamanbuku;

import perpustakaan.buku;

public class data extends buku {

    public String namasiswa;
    public String namabuku;
    public String jumlahbuku;

    public String getNamasiswa() {
        return namasiswa;
    }

    public void setNamasiswa(String namasiswa) {
        this.namasiswa = namasiswa;
    }

    public String getNamabuku() {
        return namabuku;
    }

    public void setNamabuku(String namabuku) {
        this.namabuku = namabuku;
    }

    public String getJumlahbuku() {
        return jumlahbuku;
    }

    public void setJumlahbuku(String jumlahbuku) {
        this.jumlahbuku = jumlahbuku;
    }

    public void namasiswa(){
        System.out.println("DATA PEMINJAMAN");
        System.out.println("Nama Siswa : " +namasiswa);
    }
    public void databuku(){
        System.out.println("Nama Buku :" +namabuku);
        System.out.println("Jumlah Buku yang dipinjam :" +jumlahbuku);
    }

}
