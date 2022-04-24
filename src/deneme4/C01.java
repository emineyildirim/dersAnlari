package deneme4;

import deneme3.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01 {
    public static void main(String[] args) {
        Map<Integer,String> sinifList= MapOlustur.myMap();
        Set<Map.Entry<Integer,String>>sinifEntrySet=sinifList.entrySet();
        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }


    }
}
