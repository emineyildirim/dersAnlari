package deneme3;

import java.util.*;

public class ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        Map<Integer, String> sinif = MapOlustur.myMap();

        Set<Integer> sinifKeySeti=sinif.keySet();
        List<Integer> keyList=new ArrayList<>();

        for (Integer each: sinifKeySeti
             ) {
            keyList.add(each);
        }
        Collection<String> sinifValueSet=sinif.values();
        List<String> valueList= new ArrayList<>();
        for (String each: sinifValueSet
             ) {
            valueList.add(each);
        }

        System.out.println(keyList);
        for (int i = 0; i < keyList.size(); i++) {
            System.out.println(" "+keyList.get(i)+" "+valueList.get(i));
        }
    }
}
