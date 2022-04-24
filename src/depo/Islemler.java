package depo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler extends DepoYonetimi {

    public static Scanner scan = new Scanner(System.in);
    static int id = 100;
    static List<DepoYonetimi> urunlerListesi = new ArrayList<>();

    public static void baslangic() {
        System.out.println("Yapmak istediginiz islemi seciniz :\n"
                + "Urun   tanimlama  icin --> 1 \n"
                + "Urun   listeleme    icin --> 2 \n"
                + "Urun   girisi     icin --> 3 \n"
                + "Urunu rafa koymak  icin --> 4 \n"
                + "Urun     cikisi   icin --> 5 \n"
                + "Cikis             icin --> 6");
        System.out.println("islem tercihinizi giriniz : ");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                uruntanimlama();
                break;
            case 2:
                urunListele();
                break;
            case 3:
                urunGirisi();
                break;
            case 4:
                urunuRafaKoy();
                break;
            case 5:
                urunCikisi();
                baslangic();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali tercih yaptiniz...");
                baslangic();
                break;
        }
    }
    public static void uruntanimlama() {
        System.out.println("*****   Urun Tanımlama   *****");
            System.out.print("  Urun ismi giriniz : ");
            scan.nextLine();
            String urunIsmi = scan.nextLine().toUpperCase();
            System.out.print("urunun ureticisi giriniz  : ");
            String uretici = scan.nextLine().toUpperCase();
            System.out.print("urunun birimi giriniz  : ");
            String birim = scan.nextLine().toUpperCase();

            DepoYonetimi obj = new DepoYonetimi(id, urunIsmi, uretici, birim);
            urunlerListesi.add(obj);
            id++;

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
    }
    public static void urunListele() {
        System.out.println("  id        Urun İsmi         Uretici       Miktari        Birimi       Raf");
        System.out.println("***************************************************************************");

        for (DepoYonetimi each:urunlerListesi
             ) {
            System.out.println(" "+each.getId()+" "+each.getUrunIsmi()+" "+each.getUretici()+" "+each.getBirim());
        }
        scan.nextLine();
        System.out.println("***************************************************************");
        baslangic();
    }

    public static void urunGirisi() {
        System.out.println(" Giris yapmak icin urunun Id numarasını girin : ");
        int girilenID = scan.nextInt();
        for (DepoYonetimi each: urunlerListesi) {

            if (each.getId() ==girilenID){
                System.out.println("gireceginiz urunun mikari "+each.getMiktar());
                System.out.println("girmek istediginiz miktarı girin : ");
                int giris = scan.nextInt();

                if (giris>0){
                    each.setMiktar(giris);
                    System.out.println("miktarınız eklendi..");
                    System.out.println("toplam mikar: "+each.getMiktar());
                    baslangic();
                }
                else{
                    System.out.println("hatalı giris yapdınız");
                    urunGirisi();
                }
            }
            else
                {
                    System.out.println("Giris yapdıgınız urun bulunamadı ...");
                }
        }

    }
    public static void urunuRafaKoy() {
        System.out.println(" Rafa koymak istediginiz urunun ID sini giriniz : ");
        int girilenID = scan.nextInt();

        for (DepoYonetimi each : urunlerListesi) {
            if (each.getId() ==girilenID){
                System.out.println("Koymak istediginiz rafı seciniz : ");
                each.setRaf("raf"+scan.next());
                System.out.println("Urununuz rafa koyuldu ...");
                System.out.println(" "+each.getId()+" "+each.getUrunIsmi()+" "+ each.getRaf());
                baslangic();
            }
            else
            {
                System.out.println("Koymak istediginiz urun bulunamadı ...");
                urunuRafaKoy();
            }
        }
    }
        public static void urunCikisi() {
        System.out.println("Cıkarmak istediginiz urunun ID sini yazınız : ");
        int girilenID =scan.nextInt();

        for (DepoYonetimi each : urunlerListesi) {
            if (each.getId()==girilenID)
            {
                System.out.println("gireceginiz urunun mikari "+each.getMiktar());
                System.out.println("Cıkarmak istediginiz miktari giriniz : ");
                int cikis = scan.nextInt();
                if (cikis >0)
                {
                    each.setMiktar(each.getMiktar()-cikis);
                    System.out.println("Urununuz miktari basariyla cikarıldı ...");
                    System.out.println("toplam mikar: "+each.getMiktar());
                    baslangic();
                }
                else
                {
                    System.out.println("Cikarmak istediginiz urun bulunamadı ...");
                    urunCikisi();
                }


            }
        }
    }
    private static void cikis() {
        System.out.println("İsleminiz tamamlanmistır  iyi günler  :) ");
    }
}
