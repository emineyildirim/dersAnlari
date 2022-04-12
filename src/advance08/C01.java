package advance08;

import java.util.Locale;
import java.util.Scanner;


public class C01 {
    static int a=0;
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
       C02 yolcu=new C02();
        System.out.println("gideceginiz sehri yaziniz: ");
        yolcu.sehir= scan.nextLine().toUpperCase();
        System.out.println("yasinizi giriniz: ");
        yolcu.yas= scan.nextInt();
        System.out.println("tek yön almak için 1i çift yön almak için 2yi tuşlayiniz");
        yolcu.bSayisi= scan.nextInt();
        System.out.println(yolcu.indirimliUcret());

    }
}
