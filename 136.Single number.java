class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++)
        {   //XOR is commutative, a ^ b = b ^ a
            //0 ^ 2 ^ 1 ^ 4 ^ 5 ^ 2 ^ 4 ^ 1 <=> 0^ 2^2 ^ 1^1 ^ 4^4 ^5 => 0 ^ 0 ^ 0 ^ 0 ^ 0 ^ 5 => 5
            result ^=nums[i];
        }
        return result;

        }
}
