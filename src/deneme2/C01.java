package deneme2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01 {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);

        ListIterator itr= liste.listIterator();
        System.out.println(liste);

        while (itr.hasNext())
        {
            Object sayi=itr.next();
            int sayi2=(Integer) sayi+3;
            itr.set(sayi2);

        }
        itr.add(60);
        System.out.println(liste);
    }
}
