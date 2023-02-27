package Questions_WiseQuarterPart02;

public class Course17_Arrays04 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun.
         */
        int [] arr1={2,5,2,7,2,7,5,6,4,1,6,5,6,7};
        printNumArrays(arr1,5);//3
        printNumArrays(arr1,2);//3
        printNumArrays(arr1,6);//3
        printNumArrays(arr1,4);//1
    }
    public static void printNumArrays(int [] arr, int searchNum){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchNum){
                count++;
            }
        }
        System.out.println(count);
    }

}
