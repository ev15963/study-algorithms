import java.util.Arrays;
import java.util.Comparator;

/**
 * Interview Preparation Kit - Greedy Algorithms
 * Minimum Absolute Difference in an Array
 * 
 */
public class exam9 {

  static int minimumAbsoluteDifference(int[] arr) {

    int min = Integer.MAX_VALUE;

    Integer[] ar = new Integer[arr.length];

    for (int i = 0, len = arr.length; i < len; i++) {
      ar[i] = (Integer) arr[i];
    }

    Arrays.sort(ar, Comparator.reverseOrder());

    for (int i = 0, len = ar.length - 1; i < len; i++) {
      min = Math.min(Math.abs(ar[i] - ar[i + 1]), min);
    }

    return min;
  }

  public static void main(String[] args) {
    int[] sample = { 3, -7, 0 };

    int res = minimumAbsoluteDifference(sample);

    System.out.println(res);
  }
}