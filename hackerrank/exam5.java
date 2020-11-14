/**
 * Interview Preparation Kit - Arrays
 * 2D Array - DS
 * 111
 *  1
 * 111 모양을 만들어서 가장 큰 값을 가지는 모래시계 모양을 찾아라
 */
public class exam5 {

  static int hourglassSum(int[][] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0, len = arr.length; i < len - 2; i++) {
      for (int j = 0, len2 = arr[i].length; j < len2 - 2; j++)  {
        int h1 = arr[i][j];
        int h2 = arr[i][j + 1];
        int h3 = arr[i][j + 2];
        int m1 = arr[i + 1][j + 1];
        int h4 = arr[i + 2][j];
        int h5 = arr[i + 2][j + 1];
        int h6 = arr[i + 2][j + 2];

        int sum = h1 + h2 + h3 + m1 + h4 + h5 + h6;

        if (max < sum)  {
          max = sum;
        }

        System.out.println(h1 + " " + h2 + " " + h3);
        System.out.println("  " + m1 + "  ");
        System.out.println(h4 + " " + h5 + " " + h6);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[][] sample = {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 2, 4, 4, 0},
      {0, 0, 0, 2, 0, 0},
      {0, 0, 1, 2, 4, 0},
    };

    int res = hourglassSum(sample);

    System.out.println(res);
  }
}