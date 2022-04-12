package advance08;

public class C02 {
   String sehir="";
   int yas;
   int ucretb=70;
   int ucretc=80;
   int ucretd=90;
   double iUcret=indirimliUcret();
   int bSayisi;


   public double indirimliUcret() {
      double bilet=0;
         if (sehir.equals("B"))
         {
            if (yas<12)
            {
               bilet=ucretb*(0.5);
            }
            else if (yas<24)
            {
               bilet=ucretb*0.9;
            }
            else if (yas>65)
            {
               bilet=ucretb*0.7;
            }
            else
            {
               bilet=ucretb;
            }
         }
      if (sehir.equals("C"))
      {
         if (yas<12)
         {
            bilet=ucretc*(0.5);
         }
         else if (yas<24)
         {
            bilet=ucretc*0.9;
         }
         else if (yas>65)
         {
            bilet=ucretc*0.7;
         }
         else
         {
            bilet=ucretc;
         }
      }
      if (sehir.equals("D"))
      {
         if (yas<12)
         {
            bilet=ucretd*(0.5);
         }
         else if (yas<24)
         {
            bilet=ucretd*0.9;
         }
         else if (yas>65)
         {
            bilet=ucretd*0.7;
         }
         else
         {
            bilet=ucretd;
         }
      }
      if (bSayisi==2)
      {
         bilet=2*bilet*0.8;
      }
      else if (bSayisi!=1)
      {
         System.out.println("hatali bilet sectiniz");
      }
      return bilet;
   }

}
