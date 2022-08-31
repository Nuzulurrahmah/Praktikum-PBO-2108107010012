/*Nama  : Nuzulurrahmah
  NIM   : 2108107010012 */
  
  import java.util.Scanner;
    public class Tugas1Lab
    {
        public static void main (String[] args)
        {
        Scanner beli = new Scanner(System.in);
        int harga, banyaknya, bayar, diskon, total;
        System.out.print("Harga Produk per item: ");
        harga = beli.nextInt();

        System.out.print("Jumlah Pembelian Produk : ");
        banyaknya = beli.nextInt();

        bayar = harga * banyaknya;
        diskon = bayar * 15/100;
        System.out.println("Diskon 15% : " +diskon);
    
        total = bayar - diskon;
        System.out.println("Total Biaya Pembelian Sudah Dipotong Diskonnya Menjadi : " + total);
    }
    }

