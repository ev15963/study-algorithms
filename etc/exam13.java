/**
 * 정수 뒤집기 알고리즘
 */
public class exam13 {

  public static void main(String[] args) {
    int res = 0;
    int num = 123;
    int reminder = 1;

    while (num != 0) {
      reminder = num % 10;
      res = (res * 10) + reminder;
      num /= 10;
    }

    System.out.println(res);
  }
}