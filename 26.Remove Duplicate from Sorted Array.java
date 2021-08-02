class Solution {
   public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
         // When ever i and j notEqual enter to if condition
        if (nums[j] != nums[i]) {
            // increment i and update value at i
           
            nums[++i] = nums[j];
        }
    }
    return i + 1;
 }
}