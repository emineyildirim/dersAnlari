package deneme3;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap()
    {
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"ali, can, dev, java");
        sinifList.put(102,"emine, yıldırım, qa, c++");
        sinifList.put(103,"ibrahim, ebrar, danisman, java");
        sinifList.put(104,"sueda, akcakoyun, ogrenci, java");

        return sinifList;
    }
}
