package challenges;

import java.util.Scanner;

class PalindromeExample {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String reverse = new StringBuilder().append(A).reverse().toString();
    System.out.println(A.trim().equals(reverse.trim())?"YES":"NO");
  }
}