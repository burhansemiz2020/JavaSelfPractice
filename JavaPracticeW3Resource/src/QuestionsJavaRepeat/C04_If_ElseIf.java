package QuestionsJavaRepeat;

import java.util.Scanner;

public class C04_If_ElseIf {
    public static void main(String[] args) {
        /*
        Ogrencinin notu 85 ve ustu ise AA
        65 ustu ise BB
        50 ustu ise CC
        geriye kalanlar DD
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");
        double note= scan.nextDouble();
        if (note>=85 && note<=100){
            System.out.println("Notunuz AA");
        } else if (note<85 && note>=65){
            System.out.println("Notunuz BB");
        } else if (note<65 && note>=50) {
            System.out.println("Notunuz CC");
        } else if (note<50 && note>=0) {
            System.out.println("Notunuz DD");
        }

    }
}
