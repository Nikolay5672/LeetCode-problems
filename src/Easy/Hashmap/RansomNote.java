package Easy.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            if (count <= 0) {
                return false;
            }
            map.put(ch, count - 1);
        }

        return true;
    }
}
