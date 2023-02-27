package Questions_WiseQuarterPart02;

public class Course17_Arrays02 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari
        toplayip sonucu bize donduren bir method yaziniz.
         */

        int[] arr = {1, 2, 3, 4, 10};
        System.out.println(sumNumbers(arr));

    }
    public static int sumNumbers(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                sum+=arr[i];
            }

        }
        return sum;

        }
    }

