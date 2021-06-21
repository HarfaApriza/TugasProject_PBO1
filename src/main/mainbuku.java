package main;

import peminjamanbuku.data;
import perpustakaan.buku;

public class mainbuku {
    public static void main(String[] args){


        buku tm = new buku();
        tm.tampil();

        buku wb = new buku();
        System.out.println("------------Buku 01------------");
        wb.bukuweb ="Buku Belajar Cepat Web";
        wb.bukuphp ="Cepat Belajar Php";
        wb.bt();

        buku i = new buku();
        System.out.println("------------Buku 02------------");
        i.bukumatematika ="Buku Matematika";
        i.bukufisika ="Buku Fisika";
        i.ilmu();

        buku b = new buku();
        System.out.println("------------Buku 03------------");
        b.bukubahasamandarin ="Buku Bahasa Mandarin";
        b.bukubahasaindonesia ="Cepat Belajar Php";
        b.bukuipa ="Buku IPA";
        b.bukuips ="Buku IPS";
        b.bahasa();

        data n = new data();
        System.out.println("-------------------------------");
        n.namasiswa="Harfa Apriza";
        n.namasiswa();

        data dt = new data();
        dt.namabuku ="Bahasa Mandarin";
        dt.jumlahbuku="1";
        dt.databuku();
        System.out.println("-------------------------------");

        buku c = new buku();
            System.out.println(c.bukuweb);
        System.out.println(c.bukuphp);
        System.out.println(c.bukumatematika);


    }
}
