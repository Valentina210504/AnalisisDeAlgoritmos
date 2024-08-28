
package analisisalgoritmmo;

import java.util.Scanner;


public class AnalisisAlgoritmmo {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("ingrese numero");
        int num = 600000
;
        long startTime = System.nanoTime();
        int numt = 0;
        int a;
        int total = 0;

        for (int i = 1;
                i < num;
                i++) {
            if (num % i == 0) {
                a = i;
                //System.out.println(a);
                total += a;
            }
        }

        System.out.println(total);
        if (total == num) {
            System.out.println("es un numero perfecto");
        } else {
            System.out.println("no es un numero perfecto");
        }
       
        long endTime = System.nanoTime();

        System.out.println("Program took " + (endTime - startTime) + " nanoseconds");

    }
}
