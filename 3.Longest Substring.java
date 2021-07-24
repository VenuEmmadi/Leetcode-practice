class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, result = 0;
        int[] SymbolLeng = new int[256];    // ascii range
        while (right < s.length()) {        //Exploring the entire string 
            char r = s.charAt(right);   
            SymbolLeng[r]++;
            while (SymbolLeng[r] > 1) {     //if symbol exists more than once
                char l = s.charAt(left);
                SymbolLeng[l]--;
                left++;
            }
            result = Math.max(result, right - left + 1); //highest length (+1 because starting from 0)
            right++;
        }
        return result;
    }
}