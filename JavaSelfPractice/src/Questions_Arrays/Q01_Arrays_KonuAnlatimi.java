package Questions_Arrays;

import java.util.Arrays;

public class Q01_Arrays_KonuAnlatimi {
    public static void main(String[] args) {
        int sayi3[] = {5, 6, 8, 10};
        sayi3[2] = 7;
        sayi3[0] = 1;
        System.out.println(Arrays.toString(sayi3));
        System.out.println(sayi3[2]);


        String str="Java cok guzel";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));


        String str2="Java cok guzel";
        String[] kelimeler2 = str.split("a");
        System.out.println(Arrays.toString(kelimeler2));

        String str3="Java cok guzel";
        String[] kelimeler3 = str.split("cok");
        System.out.println(Arrays.toString(kelimeler3));

        String str4="Java cok guzel";
        String[] kelimeler4 = str.split("");
        System.out.println(Arrays.toString(kelimeler4));

        int[] sayilar1={1, 2, 3};

    }

}
