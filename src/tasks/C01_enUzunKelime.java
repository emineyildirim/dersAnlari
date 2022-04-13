package tasks;

import java.util.Arrays;

public class C01_enUzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        String cumle="bugün hava çok güzel değilmi";
        String kelime=enUzunKelime(cumle);
        System.out.println("en uzun kelime: "+kelime);

    }
    private static String enUzunKelime(String cumle) {
        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr));
        String kelime="";
        for (String each:arr
             ) {
            if (kelime.length()<each.length())
            {
                kelime=each;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()==kelime.length())
            {
                kelime=arr[i];
                break;
            }
        }

        return kelime;
    }


}
