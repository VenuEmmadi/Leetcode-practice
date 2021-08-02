class Solution {
   public int missingNumber(int[] nums) {
       /*I apply XOR operation to both the index and value of the array. In a complete array with no missing numbers, the index and value should be perfectly corresponding( nums[index] = index), so in a missing array, what left finally is the missing number.*/
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i]; // a^b^b = a //finally happening is 3 ^ 0 ^ 0 ^ 1 ^ 1 ^ 2 = 1
        }

        return xor ^ i; //Because 1 ^ 3 = 2
    }
}