import java.util.HashMap;
import java.util.Map;

/**
 * Interview Preparation Kit - Dictionaries and Hashmaps Hash Tables: Ransom
 * Note
 * 
 * 잡지의 단어들로 랜섬노트의 문장을 추리할 수 있으면 Yes 그렇지 않으면 No
 */
public class exam6 {

  static void checkMagazine(String[] magazine, String[] note) {

    Map<String, Integer> noteMap = new HashMap<String, Integer>();

    for (String n : note) {
      Integer val = noteMap.get(n);

      if (val != null)  {
        noteMap.put(n, val + 1);
      } else {
        noteMap.put(n, 1);
      }
    }

    for (String m : magazine) {
      Integer n = noteMap.get(m);

      if (n != null)  {
        noteMap.put(m, n - 1);
      }
    }

    String res = "Yes";

    for (Map.Entry<String, Integer> m : noteMap.entrySet()) {
      System.out.println(m.getKey() + ", " + m.getValue());
      if (m.getValue() >= 0 && m.getValue() != 0)  {
        res = "No";
      }
    }

    System.out.println(res);

  }

  public static void main(String[] args) {
    // String[] sampleMagazine = { "give", "me", "one", "grand", "today", "night" };
    // String[] sampleNote = { "give", "one", "grand", "today" };

    String[] sampleMagazine = { "apgo", "clm", "w", "lxkvg", "mwz", "elo", "bg", "elo", "lxkvg", "elo", "apgo", "apgo", "w", "elo", "bg", };
    String[] sampleNote = { "elo", "lxkvg", "bg", "mwz", "clm", "w", };

    checkMagazine(sampleMagazine, sampleNote);
  }
}