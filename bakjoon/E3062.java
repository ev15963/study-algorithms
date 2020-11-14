import java.util.Scanner;

/**
 * Exam. 3062
 * 원래 수와 뒤집은 수의 합이 좌우 대칭인지 출력
 */
class E3062 {

  static String reverse(int num) {
    int result = 0;
    int origin = num;

    while (num != 0) {
      result = (result * 10) + num % 10;
      num /= 10;
    }

    int sum = origin + result;
    String inStr = String.valueOf(sum);
    
    for (int i = 0; i < inStr.length() / 2; i++) {
      if (inStr.charAt(i) != inStr.charAt(inStr.length() - i - 1)) {
        return "NO";
      }
    }

    return "YES";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    Integer[] arr = new Integer[count];

    for (int i = 0; i < count; i++) {
      arr[i] = scanner.nextInt();
    }

    for (int a : arr) {
      System.out.println(reverse(a));
    }

    scanner.close();

  }
}