class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length()) {
            return ans;
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }

        int j = 0;
        int i = p.length();
        while(i < s.length()){
            if(compare(pmap , smap) == true){
                ans.add(j);
            }

            char cha = s.charAt(i) ;       //charcter for acquiring -- window expanded towards ri8.
            smap.put(cha , smap.getOrDefault(cha , 0 ) + 1);

            char chr = s.charAt(i - p.length());     //charcter for release -- starting charcter which needs to be removed from map and shrink the window from left.
            if(smap.get(chr) == 1){
                smap.remove(chr);
            } 
            else{
                smap.put(chr , smap.get(chr) - 1);
            } 

            i++;
            j++;   
        }
        if(compare(pmap , smap) == true){
            ans.add(j);
        }
        return ans;
    }
    public static boolean compare(HashMap<Character,Integer> pmap,HashMap<Character,Integer>smap){
        if (pmap.size() != smap.size()) {
            return false;
        }
        for(char ch : smap.keySet()){
            if (!smap.get(ch).equals(pmap.getOrDefault(ch, 0))) {
                return false;
            }
        }
        return true;
    }
}