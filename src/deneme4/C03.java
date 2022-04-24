package deneme4;

import java.util.HashSet;

public class C03 {
    public static void main(String[] args) {
        HashSet <Integer> hSet=new HashSet<>();
        int arr[]=new int[]{1,2,3,4,5};
        elementEkle(hSet,arr);
        elementEkle(hSet,new int[]{1,2,3,4,5,6,7,8,9});
    }

    private static void elementEkle(HashSet<Integer> hSet, int[] arr) {

        for (Integer sayi:arr
             ) {
            hSet.add(sayi);
        }
        yazdir(hSet);

    }
    public static void yazdir(HashSet<Integer> hs2)
    {
        for (Integer each:hs2
             ) {
            System.out.print(each+" ");
        }
    }
}
