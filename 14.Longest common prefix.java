class Solution {
    public String longestCommonPrefix(String[] strs) {
        int flag = 0,m=0;
        String ans="";
        while(m<strs[0].length()){
            char ch = strs[0].charAt(m);
            for(int i=0;i<strs.length;i++){
                if(m == strs[i].length() || ch != strs[i].charAt(m)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                break;
            ans += ch;
            m++;
            }
        return ans;
    }
}