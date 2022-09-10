//Nama  : Nuzulurrahmah
//NIM   : 2108107010012


import java.util.Scanner;
public class Prak2No2{

    public static void main(String[] args){

        Scanner hasil = new Scanner (System.in);
        int nilai;

        System.out.println("Masukkan nilai Anda: ");
        nilai= hasil.nextInt();


            if(nilai>=87){
                System.out.println("\nNILAI HURUF\n4.00\t|\tA\n");
            }

            else if(nilai >=78 && nilai <87){
                System.out.println("\nNILAI HURUF\n3.50\t|\tAB\n");
            }

            else if(nilai >=69 && nilai <78){
                System.out.println("\nNILAI HURUF\n3.00\t|\tB\n");
            }

            else if(nilai >=60 && nilai <69){
                System.out.println("\nNILAI HURUF\n2.50\t|\tBC\n");
            }

            else if(nilai >=51 && nilai <60){
                System.out.println("\nNILAI HURUF\n2.00\t|\tC\n");
            }

            else if(nilai >=41 && nilai <51){
                System.out.println("\nNILAI HURUF\n1.00\t|\tD\n");
            }

            else{
                System.out.println("NILAI HURUF\n0.00\t|\tE");
            }



    }
}

    
