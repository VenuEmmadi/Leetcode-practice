class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        double median;

        // sending all values of nums1[] to list.
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
         // sending all values of nums2[] to list.
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        // sorting the list Using predefined function.
        Collections.sort(list);

        if(list.size()%2==0){
            //median formula if even number of values in list 
            median = (double) (list.get((list.size()/2)-1) + list.get(list.size()/2)) / 2;
        } else {
            //median formula if odd number of values in list
            median = (double) list.get(list.size()/2);
        }
        return median;
    }
}