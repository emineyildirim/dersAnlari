package deneme4;

import java.util.Arrays;
import java.util.LinkedList;

public class C02 {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("emine","ebrar","irem"));
        String isim="eminos";
        if (ll1.remove(isim))
        {
            System.out.println("bu isim vardi ve silindi");
        }
        else System.out.println("bu isim yoktu silinemedi");

        System.out.println(ll1);

    }
}
