/**
 * Interview Preparation Kit - String Manipulation Strings: Making Anagrams
 * 
 */
public class exam8 {

  static int makeAnagram(String a, String b) {
    String firstCopy = a;

    String temp = "";

    for (char c : a.toCharArray()) {
      if (b.indexOf(c) != -1) {
        temp += c;
        firstCopy = firstCopy.replaceFirst(c + "", "");
        b = b.replaceFirst(c + "", "");
      }
    }

    System.out.println("A: " + firstCopy + ", B: " + b + ", C: " + temp);

    return firstCopy.length() + b.length();
  }

  public static void main(String[] args) {
   
    String a = "fcrxzwscanmligyxyvym";
    String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";


    int res = makeAnagram(a, b);

    System.out.println(res);
  }
}