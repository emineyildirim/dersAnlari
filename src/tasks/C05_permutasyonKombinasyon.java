package tasks;

public class C05_permutasyonKombinasyon {
    public static void main(String[] args) {
        /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)
            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!
            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760
            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
        int sayi1=4;
        int sayi2=6;
        faktoriyel(sayi1,sayi2);

    }

    private static void faktoriyel(int sayi1, int sayi2) {
        int carpim1=1;
        int carpim2=1;
        int carpim3=1;
        System.out.println(sayi1+" "+sayi2);
        if (sayi1>sayi2)
        {
            for (int i = sayi1; i >0 ;i--) {
                carpim1=carpim1*i;
            }
            System.out.println("buyuk sayinin faktoriyeli: "+carpim1);
            for (int i = 1; i <= (sayi1-sayi2); i++) {
                carpim2=carpim2*i;
            }
            for (int i = sayi2; i >0 ; i--)
            {
                carpim3 = carpim3 * i;
            }
            permutasyon(carpim1,carpim2,carpim3);
            kombinasyon(carpim1,carpim2,carpim3);
        }
        else if (sayi2>sayi1)
        {
            for (int i =sayi2; i >0 ; i--) {
                carpim1*=i;
            }
            System.out.println("buyuk sayinin faktoriyeli: "+carpim1);
            for (int i = 1; i <= (sayi2-sayi1); i++) {
                carpim2*=i;
            }
            for (int i =sayi1; i >0 ; i--) {
                carpim3*=i;
            }
            permutasyon(carpim1,carpim2,carpim3);
            kombinasyon(carpim1,carpim2,carpim3);
        }
        else {
            System.out.println("esit iki sayi girdiniz tekrar deneyin");
            faktoriyel(sayi1, sayi2);
        }
    }


    private static void permutasyon(int fakt1,int fakt2,int fakt3) {
      //  Hatırlatma P(n,r) = n! / (n-r)!
        int perm=fakt1/(fakt2);
        System.out.println("permütasyon degeri: "+perm);
    }

    private static void kombinasyon(int fakt1,int fakt2,int fakt3)
    {
        //Hatırlatma C(n,r) = n! / (r!(n-r)!)
        int komb=fakt1/(fakt3*(fakt2));
        System.out.println("kombinasyon degeri: "+komb);
    }
}
