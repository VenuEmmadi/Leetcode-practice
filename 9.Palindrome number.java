class Solution {
public boolean isPalindrome(int x) {
    int reverse=0,temp=0;
    temp=x;
    while(x>0)
    {
        int n = x%10;
        reverse = (reverse*10)+n;
        x/=10;
    }
    if(reverse==temp)
       return true;
    else
       return false;

    }
}