package Questions_WiseQuarterPart02;

import java.util.Arrays;


public class Course17_Arrays01 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini
        2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.

         */

        int [] arr={3,4,5,6};
        System.out.println(Arrays.toString(arr));
        arr=arrayElementUpto(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayElementUpto(int[] firstArr, int up){
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i]+=up;

        }
        return firstArr;
    }
}
