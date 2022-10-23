package challenges;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;
 
/**
 * An example program to read a String from console input in Java
 */
public class Example {
 
    public static void main(String[] args) {
        System.out.println("Ingrease: ");
        Scanner scan = new Scanner(System.in);

        printObject(scan.next());
        printObject(scan.next());

        String sInput = "";
        while (!scan.hasNext()){
            sInput = sInput + scan.next();
        }
        printObject(sInput);
        scan.close();
    }

    private static void printObject(String o ){
        System.out.println(o);
    }
}