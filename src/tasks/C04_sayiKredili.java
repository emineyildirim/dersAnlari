package tasks;

import java.util.Random;
import java.util.Scanner;

public class C04_sayiKredili {
    static Scanner scan=new Scanner(System.in);
    static Random rnd = new Random();
    static int sayi = rnd.nextInt(101);
    static int tahmin;
    public static void main(String[] args) {

    /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
           *  Eger kullanici ilk
         * tahmininde bilirse x4 Kredi kazansin, ikici tahmininde bilirse x3, ucuncu
         * tahmininde bilirse x2 4 ve sonrasinda herhangi bir bonus kazanmasin kazanirsa
         * yeni bir oyuna baslamak istiyor mu diye sor. Baslarsa oyunu zorlastir. Kredi
         * seviyesi kritik duzeye indiginde yeni bir oyun hakki tani (30)
         */
       oyun();
    }

    private static void oyun() {
        System.out.println("tahminizi giriniz: ");
        tahmin= scan.nextInt();
        if (tahmin>sayi)
        {
            System.out.println("tahmininiz buyuk");
            oyun();
        }
        else if (tahmin<sayi)
        {
            System.out.println("tahmininiz kucuk");
            oyun();
        }
        else
        {
            System.out.println("tahmininiz dogru");
        }
    }


}
