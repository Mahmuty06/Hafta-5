import java.util.Scanner;

public class Main {
    public static void getNumberOfIndex (int[] array, int sayi) {
        if(sayi < 0 || sayi > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Dizi boyutu dışında bir index girdiniz!");
        } else {
            System.out.println(array[sayi]);
        }
    }
    public static void main(String[] args) {

      int[] dizi = {1,2,3,4,5,6,7,8,9,10 }  ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("LÜTFEN ARRAY'DE GÖSTERMEK İSTEDİĞİNİZ İNDEKS NUMARASINI GİRİNİZ : ");
         int rakam =  input.nextInt() ;
       try {
         getNumberOfIndex(dizi,rakam);
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }

    }
}