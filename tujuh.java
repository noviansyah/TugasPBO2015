package com.company;

/**
 * Created by ASUS on 3/25/2015.
 */
public class tujuh{
    public static void main(String[] args) {
        System.out.println("menghitung nilai rata-rata");
        int awal=3;
        int akhir=33;
        int jumlah=0;
        int rata;
        System.out.println("rata-rata nilai awal"+awal);
        System.out.println("rata-rata nilai akhir"+akhir);
        while (awal<=akhir);{
            jumlah=jumlah+awal;
            awal++;
        }
        System.out.println(jumlah);
        rata=jumlah/akhir;
        System.out.println("jumlah dari semua nilai rata-rata="+rata);
    }
}