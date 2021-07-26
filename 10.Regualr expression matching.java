import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String reg) {
        Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(s);
        //find() :: Attempts to find the next subsequence of the input sequence that matches the pattern.
        //The group() method of Matcher Class is used to get the input subsequence matched by the previous match result.
		if(m.find()&&m.group().equals(s)) return true;
		return false;
    }
}