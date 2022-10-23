package challenges;

import java.util.Scanner;

public class Anagram {

  static boolean isAnagram(String a, String b) {
    String lowerA = a.toLowerCase();
    String lowerB = b.toLowerCase();

    if(lowerA.length() != lowerB.length()){
      return false;
    }

    for (int i = 0; i < lowerA.length(); i++) {
      char letterToAnalize = lowerA.charAt(i);
      int totalA = getTotal(letterToAnalize, lowerA);
      int totalb = getTotal(letterToAnalize, lowerB);
      if(totalA != totalb){
        return false;
      }
    }

    return true;
  }

  static int getTotal(char letter, String word){
    int total = 0;
    for (int j = 0; j < word.length() ; j++) {
      if(word.charAt(j) == letter){
        total++;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}