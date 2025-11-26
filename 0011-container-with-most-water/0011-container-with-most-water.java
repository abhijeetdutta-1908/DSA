// class Solution {
//     public int maxArea(int[] height) {
//         int area = 0;
//         for(int i  = 0 ; i< height.length - 1 ; i++)
//         {
//             for(int j = i+1 ; j < height.length ; j++){
//                 if(height[i] < height[j]){
//                     if(area < height[i] * (j-i))
//                         area = height[i] * (j-i);
//                     }
//                 else{
//                     if(area < height[j] * (j-i)){
//                         area = height[j] * (j-i);
//                     }
                    
//                 }
                 
//             }
//         }
//         return area;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        
        while(l < r){
            int area = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, area);
            
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        
        return max;
    }
}