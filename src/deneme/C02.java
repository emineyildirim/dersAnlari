package deneme;

import java.util.List;

public class C02 {
    public static void main(String[] args) {

        String input = "java cok guzelll";
        String input2 = input.replace(" ", "");
        System.out.println("" + input2);
        int max = 0;
        int kullanim = 0;
        char harf = 'a';
        for (int i = 0; i < input2.length(); i++) {

            harf=input2.charAt(i);

            for (int j = 0; j < input2.length(); j++) {
                kullanim=0;
                if (harf == input2.charAt(j)) {
                    kullanim++;
                    if (kullanim > max) {
                        max = kullanim;
                        harf = input2.charAt(i);
                    }
                }

            }

        }
        System.out.println("en cok kullanilan harf " + harf + " "+max+"kere kullanilmiş");
    }
}
