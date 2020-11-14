import java.util.Scanner;

/**
 * 백준 자바 기본 입력 세팅
 * 클래스명은 반드시 "Main" 으로 작성
 * 입력은 스캐너 외에 다른 방법이 있으면 상관없다.
 * 출력은 System.out.println() 등으로 출력한다.
 */
public class Main {

  /**
   * 알고리즘 함수 작성 영역
   */
  private static void func () {

  }

  // Scanner 입력 객체 스태틱 설정
  private static Scanner scanner = new Scanner(System.in);

  /**
   * main 함수
   * @param args
   */
  public static void main(String[] args) {
    // Input Integer
    int n = scanner.nextInt();
    // Input String
    String s = scanner.next();
    // Input Next line
    scanner.nextLine();
  }
}