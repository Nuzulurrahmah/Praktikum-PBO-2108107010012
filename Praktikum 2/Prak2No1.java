//Nama  : Nuzulurrahmah
//NIM   : 2108107010012

import java.util.Scanner;

public class Prak2No1{

    public static void main(String [] args){

        Scanner angka=new Scanner (System.in);
        float num1,num2;
        float tambah,kurang,kali,bagi,modulo;

        //penjumlahan
        System.out.println("\nMasukkan 2 angka yang ingin dioperasikan!");
        System.out.println("----------------------------------------");
        System.out.print("Angka pertama\t: ");
        num1=angka.nextInt();

        System.out.print("Angka kedua\t: ");
        num2=angka.nextFloat();

        System.out.println();

        tambah=num1+num2;
        kurang=num1-num2;
        kali=num1*num2;
        bagi=num1/num2;
        modulo=num1%num2;

        System.out.println(num1+ "  +  "+num2+"  =  " +tambah);
        System.out.println(num1+ "  -  "+num2+"  =  " +kurang);
        System.out.println(num1+ "  *  "+num2+"  =  " +kali);
        System.out.println(num1+ "  /  "+num2+"  =  " +bagi);
        System.out.println(num1+ "  %  "+num2+"  =  " +modulo);

    }

}
