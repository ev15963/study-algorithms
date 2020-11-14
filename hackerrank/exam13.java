
/**
 * Interview Preparation Kit - Arrays
 * Arrays: Left Rotation
 * 
 */
public class exam13 {

  static int[] rotLeft(int[] a, int d) {
    
    int nextIndex = 0;
    
    // 길이만큼 이동하면 원래있던 자리로 돌아오므로, 
    // 회전수를 길이로 나눈 나머지 만큼이 실질적으로 이동한 거리가 된다.
    int distance = d % a.length;

    int[] temp = new int[distance];
    int[] result = new int[a.length];

    // System.out.println("Distance: " + distance);

    for (int i = 0, len = a.length; i < len; i++) {
      if (i < d)  {
        // System.out.println("Next: " + i + ", " + (distance - 1));
        temp[i] = a[i];
      } else {
        // System.out.println("After: " + i + ", " + (distance - 1));
        result[i - distance] = a[i];
        nextIndex += 1;
      }
    }

    for (int i = 0, len = temp.length; i < len; i++)  {
      // System.out.println("Next Index: " + nextIndex + ", Value: " + temp[i]);
      result[i + nextIndex] = temp[i];
    }

    return result;

  }

  public static void main(String[] args) {
    int[] sample = { 1, 2, 3, 4, 5 };
    int[] result = rotLeft(sample, 4);

    for (int r : result)  {
      System.out.print(r);
    }
  }
}