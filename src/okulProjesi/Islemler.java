package okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static String kisi;
    static List<Kisi> ogrenciler = new ArrayList<>();
    static List<Kisi> ogretmenler = new ArrayList<>();

    static void islemPaneli() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");
        String secim = scan.next();
        switch (secim) {
            case "1": {
                kisi = "ogrenci";
                secimPaneli();
                break;
            }
            case "2": {
                kisi = "ogretmen";
                secimPaneli();
                break;
            }
            case "Q": {
                cikis();
            }
            default:
                System.out.println("hatali secim yaptiniz");
        }
    }

    private static void cikis() {
        System.out.println("isleminizi sonlandirdiniz....");
    }

    static void secimPaneli() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t 6-ÇIKIŞ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                ekle();
                secimPaneli();
                break;
            }
            case 2: {
                arama();
                secimPaneli();
                break;
            }
            case 3: {
                listele();
                secimPaneli();
                break;
            }
            case 4: {
                silme();
                secimPaneli();
                break;
            }
            case 5: {
                islemPaneli();
                break;
            }
            case 6: {
                cikis();
                break;
            }
            default:
                System.out.println("hatali secim yaptiniz");
                secimPaneli();
        }
    }

    private static void listele() {
        System.out.println("girdiginiz ogrenciler listesi: \n" + ogrenciler.toString());
        System.out.println("\ngirdiginiz ogretmenler listesi \n" + ogretmenler.toString());
        secimPaneli();
    }

    private static void arama() {
        System.out.println("arayacağiniz kisinin tcknosunu giriniz");
        scan.nextLine();
        String arnNo = scan.nextLine();
        for (Kisi each : ogretmenler
        ) {
            if (each.getTckNo().equals(arnNo)) {
                System.out.println("aradiğiniz eşleşme ogretmenlerde bulundu.\n aradıginiz kisinin ismi soyismi: ");
                System.out.println(each.getIsimSoyisim());
                secimPaneli();
            } else {
                System.out.println("aradiginiz tckno ogretmenlerde yok");
            }
        }
        for (Kisi each : ogrenciler
        ) {
            if (each.getTckNo().equals(arnNo)) {
                System.out.println("aradiğiniz eşleşme ogrencilerde bulundu.\n aradiginiz kisinin ismi soyismi: ");
                System.out.println(each.getIsimSoyisim());
                secimPaneli();
            } else {
                System.out.println("aradiginiz tckno ogrencilerde yok");
            }
        }
        secimPaneli();
    }

    private static void ekle() {
        System.out.println("isminizi ve soy isminiz giriniz: ");
        scan.nextLine();
        String isimSoy = scan.nextLine();
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.println("tck no yu giriniz: ");
        String tckNo = scan.nextLine();
        if (kisi.equals("ogrenci")) {
            System.out.println("ogrenci sinifini giriniz: ");
            String sinif = scan.nextLine();
            System.out.println("ogrenci numarasini giriniz");
            String no = scan.nextLine();
            Ogrenci ogrenciEkle = new Ogrenci(isimSoy, tckNo, yas, no, sinif);
            ogrenciler.add(ogrenciEkle);
            System.out.println(ogrenciler.toString());
        } else {
            System.out.println("ogretmen bransini giriniz:");
            String brans = scan.nextLine();
            System.out.println("ogretmen sicil nosunu giriniz");
            String sicilNo = scan.nextLine();
            Ogretmen ogretmenEkle = new Ogretmen(isimSoy, tckNo, yas, brans, sicilNo);
            ogretmenler.add(ogretmenEkle);
            System.out.println(ogretmenler.toString());
        }
        secimPaneli();

    }
    private static void silme() {
        System.out.println("silmek istediginiz kisinin tck numarasini giriniz: ");
        String arnNo = scan.next();
        for (Kisi each : ogretmenler
        ) {
            if (each.getTckNo().equals(arnNo)) {
                ogretmenler.remove(each);
                System.out.println("kişiyi sildikten sonraki liste: \n" + ogretmenler.toString());
                secimPaneli();
                break;
            } else {
                System.out.println("aradiginiz tckno ogretmenlerde yok");
            }
        }
        for (Kisi each : ogrenciler
        ) {
            if (each.getTckNo().equals(arnNo)) {
                ogrenciler.remove(each);
                System.out.println("kişiyi sildikten sonraki liste: \n" + ogrenciler.toString());
                secimPaneli();
                break;
            } else {
                System.out.println("aradiginiz tckno ogrencilerde yok");
            }

        }
        secimPaneli();
    }
}


