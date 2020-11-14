import java.util.Scanner;

public class E2588 {

  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    int parent = scanner.nextInt();
    int child = scanner.nextInt();
    int multiply = parent * child;

    while (child != 0)  {
      System.out.println((child % 10) * parent);

      child /= 10;
    }
    
    System.out.println(multiply);
  }
}