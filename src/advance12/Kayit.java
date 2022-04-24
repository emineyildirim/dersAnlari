package advance12;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Kullanici{

   List<Kullanici> kisiler=new ArrayList<>();
    public Kayit()
    {}

    public Kullanici kayitAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz: ");
        String isim= scan.nextLine();
        Kullanici kullanici=new Kullanici(isim, LocalDateTime.now());
        kisiler.add(kullanici);
        return kullanici;
    }
    public void sansliKullanici(List<Kullanici> kll)
    {
        for (Kullanici each:kll
             ) {
            if (each.kayitZamani.getSecond()<10) {
                System.out.println("sansli kisisiniz " + each.isim);
            }
            else System.out.println("maalesef sansli kisi degilsiniz "+each.isim);
        }
    }
    public void listele()
    {
        System.out.println(" "+kisiler.toString());

    }
}

