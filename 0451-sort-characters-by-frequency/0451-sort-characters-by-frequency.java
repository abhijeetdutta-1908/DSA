import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        // 3. Build the result string using a char array
        char[] resultArray = new char[s.length()];
        int index = 0;
        
        for (Map.Entry<Character, Integer> entry : list) {
            char current = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                resultArray[index++] = current;
            }
        }
        
        return new String(resultArray);
    }
}
