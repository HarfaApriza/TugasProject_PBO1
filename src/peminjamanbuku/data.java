package peminjamanbuku;

import perpustakaan.buku;

public class data extends buku {

    public String namasiswa;
    public String namabuku;
    public String jumlahbuku;


    public void namasiswa(){
        System.out.println("DATA PEMINJAMAN");
        System.out.println("Nama Siswa : " +namasiswa);
    }
    public void databuku(){
        System.out.println("Nama Buku :" +namabuku);
        System.out.println("Jumlah Buku yang dipinjam :" +jumlahbuku);
    }

}
