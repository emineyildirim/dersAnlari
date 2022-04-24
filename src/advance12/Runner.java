package advance12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Kayit obj=new Kayit();
        List<Kullanici> kisi= new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        boolean cikismi=false;
        while (!cikismi) {
            System.out.println("isleminiz seciniz: \n 1.kayit al \n 2.sansli kisi" +
                    "\n 3.listele \n 4.cikis");
            int islem=scan.nextInt();
            switch (islem) {
                case 1: {
                    kisi.add(obj.kayitAl());
                    break;
                }
                case 2: {
                    obj.sansliKullanici(kisi);
                    break;
                }
                case 3: {
                    obj.listele();
                    break;
                }
                case 4: {
                    cikismi = true;
                }
            }
        }
    }
}
