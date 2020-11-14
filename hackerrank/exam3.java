
import java.util.HashMap;
import java.util.Map;

/**
 * Equalize the Array 배열에서 가장 많은 빈도(최반값) 의 숫자들을 제거하는 횟수 구하기
 * 
 */
public class exam3 {

  static int equalizeArray(int[] arr) {

    int allCnt = 0;
    Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();

    for (int a : arr) {
      Integer cnt = tempMap.get(a);

      if (cnt == null)  {
        tempMap.put(a, 1);
        allCnt += 1;
      } else {
        tempMap.put(a, cnt + 1);
        allCnt += 1;
      }
    }

    int max = Integer.MIN_VALUE;

    for (int c : tempMap.values())  {
      max = Math.max(c, max);
    }

    int remain = 1;

    for (Map.Entry<Integer, Integer> m : tempMap.entrySet())  {
      if (m.getValue().equals(max) && remain > 0) {
        allCnt -= max;
        remain -= 1;
      }
    }

    return allCnt;
  }

  public static void main(String[] args) {
   
    // int[] arr = {3, 3, 2, 1, 3};
    int[] arr = {37, 32, 97, 35, 76, 62};
    // int[] arr = { 24, 29, 70, 43, 12, 27, 29, 24, 41, 12, 41, 43, 24, 70, 24, 100, 41, 43, 43, 100, 29, 70, 100, 43, 41, 27, 70, 70, 59, 41, 24, 24, 29, 43, 24, 27, 70, 24, 27, 70, 24, 70, 27, 24, 43, 27, 100, 41, 12, 70, 43, 70, 62, 12, 59, 29, 62, 41, 100, 43, 43, 59, 59, 70, 12, 27, 43, 43, 27, 27, 27, 24, 43, 43, 62, 43, 70, 29 };

    Map<Integer, Integer> forTestMap = new HashMap<Integer, Integer>();

    for (int a : arr) {
      Integer temp = forTestMap.get(a);

      if (temp == null) {
        forTestMap.put(a, 1);
      } else {
        forTestMap.put(a, temp + 1);
      }
    }

    for (Map.Entry<Integer, Integer> pair : forTestMap.entrySet())  {
      System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }

    System.out.println(equalizeArray(arr));
    
  }
}