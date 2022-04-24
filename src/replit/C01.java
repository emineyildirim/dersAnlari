package replit;

import java.util.Scanner;

public class C01 {
  /*  Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

    BMI 18,5'in altındaysa zayıfsınız

    BMI 18,5 ile 25 arasında ise kilonuz idealdir

    BMI 25-30 arasındaysa şişmansınız

    BMI 30'dan büyük veya eşitse, obez

    Input:

    Output:

    Agirlik : 71

    Boy : 1,72

    BMI : 23.99945916711736
   Zayifsiniz. */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       double boy=scan.nextDouble();
       double kilo=scan.nextDouble();
       double kitleEndeksi=(kilo/(boy*boy));
       System.out.println("kitle endeksiniz "+kitleEndeksi);
       if (kitleEndeksi<18.5)
       {
           System.out.println("zayifsiniz");
       }
       else if (kitleEndeksi<25)
       {
           System.out.println("kilonuz ideal");
       }
       else if (kitleEndeksi<30)
       {
           System.out.println("şişman");
       }
       else if (kitleEndeksi>=30)
       {
           System.out.println("obez");
       }
   }
}
