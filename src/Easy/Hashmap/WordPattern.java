package Easy.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if (pattern.length() != str.length) {
            return false; // Mismatch in the number of characters and words
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> check = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(check.add(str[i])){
                    map.put(pattern.charAt(i), str[i]);
                }

                else{
                    return false;
                }
            }

            else{
                if(!Objects.equals(map.get(pattern.charAt(i)), str[i])){
                    return false;
                }

            }
        }
        return true;
    }
}
