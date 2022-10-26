package MUZAFFER_HOCA.day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
    */

    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);
        int i = 1; //bi i'yi while sartini olusturmak icin kullandik
        if (sayi <= 1) {
            System.out.println("0 ve 1'den buyuk bir rakam giriniz");
        } else {
            while (fibonacciList.get(i) < sayi) { //fibonacci elemanlari sayidan kucuk oldugu surece
                fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i - 1)); //bir onceki elemani yanindaki eleman ile toplar
                i++;
            }
            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiElaman = fibonacciList.size() - 1;
        if (fibonacciList.get(sonIndextekiElaman) > sayi) {
            fibonacciList.remove(sonIndextekiElaman); //burasi son elemani kaldirir
            System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmamaktadir = " + "sizin girdiginiz sayiya kadarki fibonacci dizisi budur" + fibonacciList);
        } else {
            System.out.println("Girdiginiz sayi fibonacci dizisinde var = " + fibonacciList);
        }
    }
}