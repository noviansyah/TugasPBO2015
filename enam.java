package com.company;

/**
 * Created by ASUS on 3/25/2015.
 */
public class enam {
    public static void main(String args[]){

        int awal=1;
        int akhir=33;
        int jumlah=0;
        System.out.println("angka yang awal adalah satu = "+awal);
        System.out.println("angka yang akhir adalah dua puluh = "+akhir);
        System.out.print("jumlah dari semua deretan angka  = ");

        while(awal<=akhir){
            jumlah=jumlah+awal;
            awal++;
        }
        System.out.println(jumlah);
    }
}
