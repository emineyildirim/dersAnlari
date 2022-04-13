package tasks;

import java.util.Scanner;

public class C02_ikininKuvveti {
    /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        boolean kontrol=PowersofTwo(sayi);
        System.out.println("sonuc: "+kontrol);
    }

    private static boolean PowersofTwo(int sayi) {
        boolean sonuc=false;
        int carpim=1;
        for (int i = 0; i <= sayi; i=i+1) {
           double a=Math.pow(2,i);
            if (a==sayi)
            {
                sonuc=true;
            }
        }
        return sonuc;
    }


}
