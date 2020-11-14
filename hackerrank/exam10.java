
public class exam10 {

  public static int fibonacci(int n) {
    return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    int res = fibonacci(5);

    System.out.println(res);
  }
}