

/**
 * Repeated String
 * 일정한 문자열을 n번으로 만들었을때 'a' 가 나타나는 횟수
 */
public class exam2 {

  static long repeatedString(String s, long n) {

    if (s.equals("a"))  {
      return n;
    }

    int aCount = 0;

    for (String sc : s.split("")) {
      if (sc.equals("a")) {
        aCount += 1;
      }
    }

    long div = n / s.length();
    long mod = n % s.length();
    long res = div * aCount;

    char[] sArr = s.toCharArray();

    for (int i = 0; i < mod; i++) {
      if (sArr[i] == 'a') {
        res += 1;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    
    System.out.println(repeatedString("aba", 10));
  }
}