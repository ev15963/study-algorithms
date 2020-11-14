import java.util.Scanner;

/**
 * Title: 시험 성적
 * Question: 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * Input: 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * Output: 시험 성적을 출력한다.
 */
public class E9498 {

  /**
   * 알고리즘 함수 작성 영역
   */
  public static String exam (int score) {
    String result = null;

    if (score < 0 || score > 100) {
      result = "F";
    } else {
      if (score < 101 && score > 89)  {
        result = "A";
      } else if (score < 90 && score > 79)  {
        result = "B";
      } else if (score < 80 && score > 69)  {
        result = "C";
      } else if (score < 70 && score > 59)  {
        result = "D";
      } else {
        result = "F";
      }
    }

    return result;
  }

  // Scanner 입력 객체 스태틱 설정
  private static Scanner scanner = new Scanner(System.in);

  /**
   * main 함수
   * @param args
   */
  public static void main(String[] args) {
    // Input Integer
    int score = scanner.nextInt();
    
    String result = exam(score);

    System.out.println(result);
  }
}