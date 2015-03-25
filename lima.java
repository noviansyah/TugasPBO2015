package com.company;

/**
 * Created by ASUS on 3/25/2015.
 */
public class lima {
    public static void main(String args[]){

        int awal=1;
        int akhir=33;
        System.out.println("angka pertama = "+awal);
        System.out.println("angka terakhir = "+akhir);

        while(awal<=akhir){
            System.out.print(+awal);
            if(awal<akhir){
                System.out.print(",");
            }
            awal++;
        }
    }
}