class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[]{-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array[0]=i;array[1]=j;
                    break;
                }
            }
        }
        return array;
    }
}