package depoDeneme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Islemler extends DepoYonetimi {
    static Scanner scan = new Scanner(System.in);
    public static int id=100;

    static List<DepoYonetimi> urunlerListesi = new ArrayList<>();


    public static void baslangic(){
        System.out.println("Yapmak istediginiz islemi seciniz :\n"+
                "Urun Tanimlama icin 1\n" +
                "Urun Listeme icin 2\n" +
                "Urun Girisi icin 3\n" +
                "Urunu Rafa koymak icin 4\n" +
                "Urun Cikisi icin 5\n"+
                "Butun islemleri bitirmek icin 0'a basiniz");
        int tercih= scan.nextInt();
        switch (tercih){
            case 1:
                uruntanimlama();
                baslangic();
                break;
            case 2:
                urunListele();
                baslangic();
                break;
            case 3:
                urunGirisi();
                baslangic();
                break;
            case 4:
                urunuRafaKoy();
                baslangic();
                break;
            case 5:
                urunCikisi();
                baslangic();
                break;

            case 0:
                cikis();
                break;

            default:
                System.out.println("Hatali bir giris yaptiniz...");
                baslangic();
                break;
        }

    }

    private static void cikis() {
        System.out.println("Cikis yaptiniz");
    }

    private static void urunCikisi() {
      //  boolean cikisDogruMu=false;
        urunListele();
        System.out.println("Cikis yapmak istediginiz urunun id'sini giriniz :");
        int cikisId= scan.nextInt();
        for (DepoYonetimi each:urunlerListesi
        ) {
            if (each.getId()==cikisId){
                System.out.println("Cikilacak urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0 && kacMiktar<each.getMiktar()){
                    each.setMiktar(each.getMiktar()-kacMiktar);
                    System.out.println("şuan ki toplam miktar: "+each.getMiktar());
                }else  System.out.println(" Yeterli urun olmadigi icin cikis yapilamadi. ");
             //   cikisDogruMu=true;
                break;
            }
        }
    }

    public static void urunuRafaKoy() {

        urunListele();
        System.out.println("Lutfen urun listesinden gecerli bir id giriniz: ");
        int girisId= scan.nextInt();

        for (DepoYonetimi each : urunlerListesi
        ) {
            if (each.getId()==girisId){
                System.out.println("Urunu koymak istediginiz rafi seciniz ");
               /* urunlerListesi.get(raf).setRaf(scan.nextInt());
                  rafaKoyduMu=true;
                  urunListele(); */
                each.setRaf(scan.nextInt());
            }

           else {
                System.out.println("Urun bulunamadigi icin rafa kaldirilmadi");
            }
        }
        baslangic();
    }




    public static void urunGirisi() {

      //  boolean sonuc=false;
        System.out.println("Giris yapmak istediginiz urunun id'sini giriniz :");
        int girisId=scan.nextInt();
        for (DepoYonetimi each : urunlerListesi
        ) {
            if (each.getId()==girisId){
                System.out.println("Girilecek urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0){
                 //   urunlerListesi.get(kacMiktar).setMiktar(kacMiktar+urunlerListesi.get(kacMiktar).);
                    each.setMiktar(each.getMiktar()+kacMiktar);
                    System.out.println("Toplam miktar: "+each.getMiktar());
                }else System.out.println("Gecerli bir miktar giriniz. ");
             //   sonuc=true;
                break;
            }
        }

    }

    public static  void urunListele() {
        System.out.println("id     Urun İsmi     Uretici      Miktari        Birimi     Raf");
        System.out.println("********************************************************************");
        for (int i = 0; i < urunlerListesi.size() ; i++) {
            System.out.printf("%-3d    %-9s     %-9s      %3d           %-7s   Raf%2d  \n",
                    urunlerListesi.get(i).getId(),urunlerListesi.get(i).getUrunIsmi(),urunlerListesi.get(i).getUretici(),
                    urunlerListesi.get(i).getMiktar(),urunlerListesi.get(i).getBirim(),urunlerListesi.get(i).getRaf());
        }
        scan.nextLine();
        System.out.println("********************************************************************");
    }


    public static List<DepoYonetimi> uruntanimlama() {
       // boolean flag = true;


            System.out.print(" Urun tanimlamak icin ;\n urunun ismi :");
            scan.nextLine();
            String urunAdi = scan.nextLine();

            System.out.print("urunun ureticisi : ");
            String uretici = scan.nextLine();

            System.out.print("urunun birimi : ");
            String birim = scan.nextLine();
            int miktar=0;
            int raf=0;
            DepoYonetimi obj = new DepoYonetimi(id,urunAdi,uretici,birim,miktar,raf);
            urunlerListesi.add(obj);
            id++;
            System.out.println("\n");

        System.out.println("Eklemeyi bitirmek icin 0 ye basınız \n devam  etmek icin 1 e basınız");
        int devam = scan.nextInt();
        if (devam==0){
            System.out.println("Urun tanımlama isleminiz bitti  :) ");
            baslangic();
        }
        else
        {
            uruntanimlama();
        }




        return urunlerListesi;
    }
}
