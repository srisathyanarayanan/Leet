class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
         int first = 0;
        int second = 0;
        int last = 0;
        for(int i:nums1){
            first+=i;
        }
        System.out.println(first);
        for(int i:nums2){
            second+=i;
        }
        System.out.println(second);

        last = (second-first)/ nums1.length;

        System.out.println(last);
        return last;
    }
}