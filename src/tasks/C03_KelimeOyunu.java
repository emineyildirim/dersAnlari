package tasks;

import java.util.Scanner;

public class C03_KelimeOyunu {
    static  Scanner scan=new Scanner(System.in);

    static String kelime;
    static String Bkelime="";
    static int emine;
    static int ebrar;
    static int kontrol=0;
    public static void main(String[] args) {
        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        secim();
    }
    private static void secim() {

        System.out.println(" "+((kontrol%2)+1)+".oyuncu"+"bir kelime giriniz");
        kelime= scan.next();
        System.out.println("kelimeniz: "+kelime);
        System.out.println("kelimeyi kabul ediyorsanız 1e etmiyosanız 2ye basin");
        int secim= scan.nextInt();
        if (secim==1)
        {
            if (kontrol%2==0)
                {
                    ebrar+=kelime.length();
                    System.out.println("ebrarın puanı: "+ebrar);
                }
                else
                {
                    emine+=kelime.length();
                    System.out.println("eminenin puanı: "+emine);
                }
            }

        else if (secim==2)
            {
                if (kontrol%2==0)
                {
                    System.out.println("gecersiz kelime");
                    System.out.println("ebrar kazanmıstir");
                    System.out.println("puani: "+ebrar);
                }
                else
                {
                    System.out.println("gecersiz kelime");
                    System.out.println("emine kazanmıstir");
                    System.out.println("ebrar kaybetti");
                    System.out.println("puani: "+emine);
                }
                cikis();
            }
        kontrol=kontrol+1;
        System.out.println("devam etmek isterseniz 1e etmek istemezseniz herhangi bir tuşa basın");
        int kontrol2= scan.nextInt();
        if (kontrol2==1) {
            System.out.println("girdiginiz stringi basina eklemek isterseniz 1e,sonuna eklemek isterseniz 2ye basiniz");
            int secim2= scan.nextInt();
            if(secim2==1) {
                    Bkelime = kelime + Bkelime;
                    System.out.println("yeni kelimeniz: "+Bkelime);
                }
            else {
                    Bkelime = Bkelime + kelime;
                    System.out.println("yeni kelimeniz: "+Bkelime);
                }
            secim();
            }
        else
        {
            cikis();
        }

        }

    private static void cikis() {
        System.out.println("game over");
    }


}
