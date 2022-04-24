package deneme3;

import java.util.*;

public class C01 {
    public static void main(String[] args) {
        Map<Integer, String> sinif = MapOlustur.myMap();
        String istenenDil="java";
        List<String> istenenDiliBilenler=listeOlustur(sinif,istenenDil);
        System.out.println(istenenDiliBilenler);

    }

    private static List<String> listeOlustur(Map<Integer, String> sinif, String istenenDil) {
        List<String> istenenListe=new ArrayList<>();

        Collection<String> sinifValueColl=sinif.values();
        List<String> sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        int out= sinif.size();
        String ilkValue=sinifValueList.get(0);
        String ilkArray[]=ilkValue.split(", ");
        int in=ilkArray.length;
        String value[][]=new String[out][in];
        for (int i = 0; i < out; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < in; j++) {
                value[i][j]=temp[j];
            }
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i][3].equals(istenenDil))
            {
                istenenListe.add(value[i][0]);
                System.out.println("listeye eklenen kisi: "+value[i][0]);
            }
        }

        System.out.println(Arrays.deepToString(value));
        return istenenListe;
    }
}
