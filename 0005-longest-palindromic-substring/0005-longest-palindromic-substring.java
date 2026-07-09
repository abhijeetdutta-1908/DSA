class Solution {
    public String longestPalindrome(String s) {
        //ax = axis
        //orb = orbit 

        //for odd places(keep the axis at the positions or index and start drawing a orbit)
        String res = "";
        for(int ax = 0 ; ax < s.length() ; ax++){
            int length = 1;
            int orb = 1;

            while(ax- orb >= 0 && ax+orb < s.length()){
                if(s.charAt(ax-orb) == s.charAt(ax+orb)){
                    orb++;
                    length += 2;
                }
                else{break;}
            }

            if(length > res.length()){
                res = s.substring(ax - length/2 , ax-length/2 + length);
            }
        }

     //for even places(keep the axis in between two positions or index and start drawing a orbit)
        for(int ax = 0 ; ax < s.length() ; ax++){
            int length = 0;
            int orb = 1;

            while(ax- orb +1 >= 0 && ax+orb < s.length()){
                if(s.charAt(ax-orb+1) == s.charAt(ax+orb)){
                    orb++;
                    length += 2;
                }
                else{break;}
            }
            if(length > res.length()){
                res = s.substring(ax - length/2  + 1, ax-length/2 + 1 + length);
            }
        }
        return res;
    }
}