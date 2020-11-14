
/**
 * Solved Jumping On The Clouds
 * 최대 2칸까지 이동이 가능한 구름 사다리 게임
 * 최소 1번이며 방해물은 2칸을 이동하여야 한다.
 */
public class exam1 {

  static int jumpingOnClouds(int[] c) {
    
    int i = 0;
    int count = 0;

    while ((i + 1) <= c.length - 1) {
      int add = 0;

      if (c[i + 1] == 0) {
        if ((i + 2 < c.length - 1) && c[i + 2] == 0) {
          add = 2;
          count += 1;
        } else {
          add = 1;
          count += 1;
        }

      } else {
        add = 2;
        count += 1;
      }

      i += add;

      System.out.println(i + ", " + count + ", " + add);
    }

    return count;
  }

  public static void main(String[] args) {
    int[] data = {0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};

    System.out.println(jumpingOnClouds(data));
  }
}