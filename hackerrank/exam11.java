
/**
 * 문자열 압축
 */
public class exam11 {

  public static void compress (String str) {

    int term = str.length() / 2;
    int min = Integer.MAX_VALUE;
    String minText = "";

    while (term > 0)  {

      String init = str.substring(0, term);
      String text = "";
      int count = 0;
      int i = 0;
      int len = str.length();
      
      for (i = 0; i <= len ; i += term)  {
          int lastIndex = i + term > str.length() ? str.length() : i + term;
          String current = str.substring(i, lastIndex);
          
          if (current.equals(init)) {
            count += 1;
          } else {
            text += init + count;
            init = current;
            count = 1;
          }
      }
      
      if (i - term != str.length()) {
        text += str.substring(i - term, str.length());
      }

      if (min > text.length())  {
        min = text.length();
        minText = text;
      }

      System.out.println("Text: " + text + ", Length: " + text.length());

      term -= 1;
    }

    System.out.println("Original Text: " + str + ", Length: " + str.length());
    System.out.println("Minimal Comp Text: " + minText + ", Length: " + min);

  }

  public static void main(String[] args) {
    compress("aabcccaaa");
  }
}