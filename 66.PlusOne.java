public class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        //this 'for' loop will convert 9's to 0's ex- 3999 to 3000
        for(int i = digits.length - 1; i >= 0; i--)
        {
            //if no element 9 then just increment last digit and return. 
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        //if all elements are 9's ex-9999 should become 10000
        int[] plusOne = new int[digits.length + 1]; //1 more element in output so length increased by +1
        plusOne[0] = 1;
        for(int i = digits.length ; i > 0; i--)
        {
            plusOne[i] = digits[i-1]; //copying all zeros to new array
        }
        return plusOne;
    }
}