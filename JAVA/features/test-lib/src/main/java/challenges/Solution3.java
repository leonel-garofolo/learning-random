package challenges;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        String i = scan.next();
        String d = scan.next();
        String l = scan.next();
        l += scan.nextLine();
        
        System.out.println("String: " + l);
        System.out.println("Double: " + Double.valueOf(d));
        System.out.println("Int: " + i);          
        scan.close();
    }
}