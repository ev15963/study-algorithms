/**
 * Interview Preparation Kit - Sorting
 * Sorting: Bubble Sort
 * 버블정렬에서 스왑된 횟수와 정렬 후 첫 원소와 마지막 원소를 출력 
 */
public class exam7 {

  static void countSwaps(int[] a) {

    int count = 0;

    for (int i = 0, len = a.length; i < len; i++) {
      for (int j = i; j < len; j++)  {
        if (a[i] > a[j])  {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          count += 1;
        }
      }
    }

    System.out.println("Array is sorted in " + count + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);

  }

  public static void main(String[] args) {
    int[] sample = { 3, 2, 1 };

    countSwaps(sample);
  }
}